public class BigbenchClone{    
    
    public Channel getChannel() {
        return readable() ? readChannel : writeChannel;
    }
}