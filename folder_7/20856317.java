public class BigbenchClone{    
    @SuppressWarnings("unchecked")
    
    public <T extends Serializable> ChannelServicePool<T> getServicePool() {
        return new ChannelServicePoolImpl<T>((ChannelImpl<T>) getChannel("__pool__", true));
    }
}