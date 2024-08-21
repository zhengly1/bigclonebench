public class BigbenchClone{    
    public String getChannelName() {
        if (ch_ == null) {
            return null;
        } else {
            return ch_.channelName();
        }
    }
}