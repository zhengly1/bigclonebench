public class BigbenchClone{    
    public Integer[] getChannelIds() {
        Set<Channel> channels = getChannels();
        return Channel.fetchIds(channels);
    }
}