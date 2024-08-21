public class BigbenchClone{    
    public Action getChannelUpAction() {
        if (this.channelUpAction == null) {
            this.channelUpAction = new ChannelUpAction();
        }
        return channelUpAction;
    }
}