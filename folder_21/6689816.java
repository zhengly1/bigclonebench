public class BigbenchClone{    
    
    public void connectChannel() {
        channel = ChannelFactory.defaultFactory().getChannel(channelName);
        stat = channel.connectAndWait();
    }
}