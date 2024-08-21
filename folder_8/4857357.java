public class BigbenchClone{    
    protected String getChannelNumberAsString(Channel channel) {
        return ((ChannelImpl) channel).getNumberAsString();
    }
}