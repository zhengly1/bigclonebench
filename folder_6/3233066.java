public class BigbenchClone{    
        
        protected DatagramChannel getChannel() throws IOException {
            c = DatagramChannelEmul.open();
            c.connect(new InetSocketAddress(53));
            return c;
        }
}