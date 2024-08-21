public class BigbenchClone{    
    public void killOpenPressed() {
        ChannelFrame.filterChooserFrame.choiceMade("shutter");
        ChannelFrame.filterPanel.getChannelDisplay().getPattern().killOpenPressed();
    }
}