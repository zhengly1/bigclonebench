public class BigbenchClone{    
    public ChannelMode getChannelMode() {
        return PortletAppEngineUtils.getChannelMode(_portletURLImpl.getPortletMode());
    }
}