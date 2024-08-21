public class BigbenchClone{    
    
    public ReadableByteChannel getChannel() throws IOException {
        return ByteUtils.getChannel(getStream());
    }
}