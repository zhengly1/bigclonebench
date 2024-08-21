public class BigbenchClone{    
    public Channel getChannel(String channelName) {
        return channelMap.get(channelName.toLowerCase());
    }
}