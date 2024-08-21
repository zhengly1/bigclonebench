public class BigbenchClone{    
        public void interestRead(Channel channel) throws ChannelClosedException {
            Context.getInstance().getChannelManager().onReadRequired(channel);
        }
}