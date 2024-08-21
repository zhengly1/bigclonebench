public class BigbenchClone{    
    public boolean isDisconnected() {
        return !getChannel().isConnected();
    }
}