public class BigbenchClone{    
    public IGenericChannelTemplate createTemplate() throws XAwareException {
        return this.m_channelSpecification.getChannelTemplate();
    }
}