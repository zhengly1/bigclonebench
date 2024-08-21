public class BigbenchClone{    
    protected void closeRemote() {
        if (null != remoteFuture && remoteFuture.getChannel().isConnected()) {
            remoteFuture.getChannel().close();
        }
    }
}