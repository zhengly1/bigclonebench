public class BigbenchClone{    
    public RTPDataChannel getChannel() throws IOException {
        return new RTPDataChannel(this);
    }
}