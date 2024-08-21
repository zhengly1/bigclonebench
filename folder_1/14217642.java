public class BigbenchClone{    
    public ChannelSettings getChannelSettings(String ref) {
        return (ChannelSettings) channelSettings.get(ref);
    }
}