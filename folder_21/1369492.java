public class BigbenchClone{    
    public SocketSession createSession(String address) {
        getChannel(address);
        return new SocketSession(this, address);
    }
}