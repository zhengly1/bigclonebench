public class BigbenchClone{    
                        public void run() {
                            server.outputDataArrivedToServer((BigEndianHeapChannelBuffer) e.getMessage(), e.getChannel().getId().toString());
                        }
}