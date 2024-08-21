public class BigbenchClone{    
    public Hashtable getChannelDefinitions() {
        Hashtable channelDefinitions = super.getChannelDefinitions();
        channelDefinitions.putAll(channels);
        return channelDefinitions;
    }
}