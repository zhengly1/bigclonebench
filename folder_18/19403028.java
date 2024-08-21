public class BigbenchClone{    
    protected AbstractIRCChannel getChannelImpl(String name) {
        return new DefaultIRCChannel(name, this);
    }
}