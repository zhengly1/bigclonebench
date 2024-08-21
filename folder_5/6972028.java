public class BigbenchClone{    
    public void channelAdded(ChannelsEvent evt) {
        int channelNumber = evt.getChannelNumber();
        updateChannelsView(false, channelNumber);
    }
}