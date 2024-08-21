public class BigbenchClone{    
    
    public ReadableByteChannel getChannel() throws IOException {
        return NioUtils.getChannel(this);
    }
}