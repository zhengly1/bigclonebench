public class BigbenchClone{    
                
                public void run() {
                    try {
                        writerThread.finishSendingMessages();
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
}