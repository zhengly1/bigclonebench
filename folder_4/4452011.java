public class BigbenchClone{    
    public ChannelDeletedPanel getChannelDeletedPanel() {
        if (channelDeletedPanel == null) {
            channelDeletedPanel = new ChannelDeletedPanel();
        }
        return channelDeletedPanel;
    }
}