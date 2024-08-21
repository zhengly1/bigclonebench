public class BigbenchClone{    
    public ChannelParkingPanel getChannelParkingPanel() {
        if (channelParkingPanel == null) {
            channelParkingPanel = new ChannelParkingPanel();
        }
        return channelParkingPanel;
    }
}