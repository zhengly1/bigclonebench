public class BigbenchClone{    
    public Channel<Throwable> getExceptionChannel() {
        return getChannel(EXCEPTION_CHANNEL_ID);
    }
}