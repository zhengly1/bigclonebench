public class BigbenchClone{    
    public ChannelImpl getChannel(ChannelId id) {
        return _root.getChild(id);
    }
}