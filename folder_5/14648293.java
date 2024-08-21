public class BigbenchClone{    
    public void poison() throws IllegalStateException, ChannelException {
        if (isClosed()) {
            throw new IllegalStateException("Port is closed.");
        }
        getChannel().poison();
    }
}