public class BigbenchClone{    
    public int read(ByteBuffer b) throws IOException {
        return socket.getChannel().read(b);
    }
}