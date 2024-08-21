public class BigbenchClone{    
    public String getChannelID() {
        return Dispatch.get(this, "ChannelID").toString();
    }
}