public class BigbenchClone{    
    public void shutDown() {
        m_messengers.getChannelMessenger().unregisterChannelSubscriber(m_statusChannelSubscribor, IStatusChannel.STATUS_CHANNEL);
    }
}