public class BigbenchClone{    
    public Collection<Channel> getChannels() {
        return Collections.unmodifiableCollection(myChannels.values());
    }
}