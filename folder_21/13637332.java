public class BigbenchClone{    
    public SocketChannel getChannel() {
        return this.getClient().getConnection().getChannel();
    }
}