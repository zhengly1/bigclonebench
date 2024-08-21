public class BigbenchClone{    
     
    public void testClientSendServerError() throws IOException {
        ServerBootstrap bootstrap = connectServer(new SimpleChannelHandler() {

            
            public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
                ChannelBuffer buff = ChannelBuffers.directBuffer(10);
                buff.writeInt(500);
                e.getChannel().write(buff);
                e.getChannel().close();
            }

            
            public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
                System.out.println("ChannelConnected");
            }

            
            public void closeRequested(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
                System.out.println("Close Requested");
                e.getChannel().disconnect();
            }
        });
        ExecutorService service = Executors.newCachedThreadPool();
        Timer timeoutTimer = new HashedWheelTimer();
        try {
            InetSocketAddress socketAddress = new InetSocketAddress("localhost", testPort);
            ClientConnectionImpl binClient = new ClientConnectionImpl(Executors.newCachedThreadPool(), new NioClientSocketChannelFactory(service, service), timeoutTimer);
            binClient.setProtocol(new ProtocolImpl(new CompressionPoolFactoryImpl(10, 10, new AgentStatusImpl())));
            ByteArrayInputStream inputStream = new ByteArrayInputStream("Test data".getBytes());
            FileLinePointer fileLinePointer = new FileLinePointer();
            Header header = new Header();
            header.setCodecClassName(GzipCodec.class.getName());
            FileStreamer fileLineStreamer = new FileStreamer() {

                CompressionCodec codec = new GzipCodec();

                
                public boolean streamContent(FileLinePointer fileLinePointer, BufferedReader input, OutputStream output) throws IOException {
                    try {
                        output.write("TestData".getBytes());
                        output.close();
                    } catch (Throwable t) {
                        t.printStackTrace();
                    }
                    return true;
                }

                
                public void setCodec(CompressionCodec codec) {
                }

                
                public void setBufferSize(long bufferSize) {
                }

                
                public CompressionCodec getCodec() {
                    return codec;
                }

                
                public long getBufferSize() {
                    return 0;
                }
            };
            try {
                binClient.connect(socketAddress);
                BufferedReader input = new BufferedReader(new InputStreamReader(inputStream));
                binClient.sendLines(fileLinePointer, header, fileLineStreamer, input);
                assertTrue(false);
            } catch (ServerException clientException) {
                assertTrue(true);
            } finally {
                binClient.close();
            }
        } finally {
            service.shutdown();
            timeoutTimer.stop();
            bootstrap.releaseExternalResources();
        }
    }
}