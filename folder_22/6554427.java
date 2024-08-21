public class BigbenchClone{    
    public ChannelMode getChannelMode() {
        return PortletAppEngineUtils.getPortletMode(_portletURLImpl.getPortletMode());
    }
}