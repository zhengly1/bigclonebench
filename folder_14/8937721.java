public class BigbenchClone{    
    public void addActiveChannel(NodeChannel nodeChannel) {
        activeChannels.add(nodeChannel);
        activeChannelIds.add(nodeChannel.getChannelId());
    }
}