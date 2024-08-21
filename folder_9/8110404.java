public class BigbenchClone{    
    public ChannelWorldInterface getChannel(int channel) {
        return channelServer.get(channel);
    }
}