public class BigbenchClone{    
    public void onClosed(Object userContext) {
        logger.debug("#closed.cid:" + getChannelId());
        super.onClosed(userContext);
    }
}