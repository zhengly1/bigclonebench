public class BigbenchClone{    
    public final D getCurrentData(Channel channel) {
        return currentData.get(channel.getChannelNum());
    }
}