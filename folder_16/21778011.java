public class BigbenchClone{    
    private void onWcMessage(String message) {
        logger.debug("#message text cid:" + getChannelId());
        if (wsClient != null) {
            wsClient.onWcMessage(userContext, message);
        }
    }
}