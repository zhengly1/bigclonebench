public class BigbenchClone{    
    public Channel getChannel() {
        return getOutboundTransport().getChannel(this);
    }
}