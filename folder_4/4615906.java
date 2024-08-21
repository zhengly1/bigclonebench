public class BigbenchClone{    
    public void onFinished() {
        logger.debug("#finished.cid:" + getChannelId());
        super.onFinished();
    }
}