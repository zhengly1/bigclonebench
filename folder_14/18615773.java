public class BigbenchClone{    
    public Channel getChannel(Long id) {
        return this.channelDAO.getChannel(id);
    }
}