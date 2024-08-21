public class BigbenchClone{    
    public String getChannelNameLowercased() {
        synchronized (channelName) {
            if (channelNameLowercased == null) channelNameLowercased = channelName.toLowerCase();
        }
        return channelNameLowercased;
    }
}