public class BigbenchClone{    
    protected float getValidYLength() {
        return ((AClip) getChannelModel().getParent().getParent()).getSampleRate() / 2;
    }
}