public class BigbenchClone{    
    public int getChannelOwner(String channel) {
        return channelOwners.get(Utilities.formatString(channel));
    }
}