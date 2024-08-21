public class BigbenchClone{    
    public Channel getChannel(String chanName) {
        return channels.get(chanName.toLowerCase());
    }
}