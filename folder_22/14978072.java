public class BigbenchClone{    
    
    public boolean isOpen() {
        final SocketChannel channel = getChannel();
        return (channel != null) && channel.isConnected();
    }
}