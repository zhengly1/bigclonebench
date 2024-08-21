public class BigbenchClone{    
                    public void run() throws Exception {
                        channel.transferFrom(AccesssUtil.createInMemoryOutputChannel(), 0, 1);
                    }
}