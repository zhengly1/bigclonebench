public class BigbenchClone{    
    public int getFrameSize() {
        if (hasReadHeaders()) {
            return audioFormat.getFrameSize();
        }
        return getChannels() * ((getSampleSizeInBits() + 7) / 8);
    }
}