public class BigbenchClone{    
    public String getChannelId() {
        if (channel != null) {
            return channel.getId();
        }
        return null;
    }
}