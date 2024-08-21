public class BigbenchClone{    
    public boolean sendSync(MessageExchange exchange, long timeout) throws MessagingException {
        assert exchange != null;
        createTarget(context.getNmr(), exchange);
        exchange.setProperty(SEND_SYNC, Boolean.TRUE);
        ((MessageExchangeImpl) exchange).afterSend();
        InternalExchange ie = (InternalExchange) ((MessageExchangeImpl) exchange).getInternalExchange();
        return getChannelToUse(ie).sendSync(ie, timeout);
    }
}