public class BigbenchClone{    
    public int transferFrom(ReadableByteChannel channel) throws IOException {
        return transferFrom(channel, Integer.MAX_VALUE);
    }
}