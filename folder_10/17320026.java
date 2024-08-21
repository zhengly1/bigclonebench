public class BigbenchClone{    
    public Integer getChannelState() {
        return channelState == null ? AstState.str2state(channelStateDesc) : channelState;
    }
}