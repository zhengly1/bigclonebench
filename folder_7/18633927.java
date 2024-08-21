public class BigbenchClone{    
        private String getApplicationData() {
            return getApplicationServerRoot() + callParameters.getChannelApplet().getChannelAppletLocation().getStringRepresentation();
        }
}