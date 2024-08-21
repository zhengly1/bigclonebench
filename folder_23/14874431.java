public class BigbenchClone{    
    @Transactional(readOnly = true)
    public Channel getChannel(Long id) {
        return ChannelDao.get(id);
    }
}