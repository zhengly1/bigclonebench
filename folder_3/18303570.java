public class BigbenchClone{    
    
    public List<Channel> retrieve() {
        return new ArrayList<Channel>(channelService.getChannels());
    }
}