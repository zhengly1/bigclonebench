public class BigbenchClone{    
    private void setupChatClient() {
        BattleNetChatClientFactory fact = createFactory();
        chat_client = fact.createClient();
        chat_client.addListener(new ChatClientListener());
        chat_client.connect(new InetSocketAddress("clanwts.com", 6112)).addListener(new FutureListener<Void>() {

            
            public void onCancellation(Throwable cause) {
                cause.printStackTrace();
                System.exit(-1);
            }

            
            public void onCompletion(Void result) {
                chat_client.login("Nixon'sBitch", "dijkstra213", true).addListener(new FutureListener<Void>() {

                    
                    public void onCancellation(Throwable cause) {
                        cause.printStackTrace();
                        System.exit(-1);
                    }

                    
                    public void onCompletion(Void result) {
                        chat_client.join("W3").addListener(new FutureListener<Void>() {

                            
                            public void onCancellation(Throwable cause) {
                                cause.printStackTrace();
                                System.exit(-1);
                            }

                            
                            public void onCompletion(Void result) {
                                java.awt.EventQueue.invokeLater(new Runnable() {

                                    
                                    public void run() {
                                        channel_name.setText("W3");
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}