public class BigbenchClone{    
    protected JComponent createPanel() {
        panelChannels = new ChannelsPanel(getShow().getChannels());
        return panelChannels;
    }
}