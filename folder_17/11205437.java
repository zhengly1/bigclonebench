public class BigbenchClone{    
    private void jRadioButton8ItemStateChanged(ItemEvent evt) {
        if (getInitProvider() == null || getInitProvider().isInitiating() || evt.getStateChange() != ItemEvent.SELECTED) {
            return;
        }
        MidiThread.getInstance().emitParamChange(this, getChannelNumber(), RackAttack.DRY_OUT, 7);
    }
}