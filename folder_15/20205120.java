public class BigbenchClone{    
    
    public ChannelApiService getChannelApiService() {
        if (channelApiService == null) {
            channelApiService = new ChannelApiServiceImpl();
        }
        return channelApiService;
    }
}