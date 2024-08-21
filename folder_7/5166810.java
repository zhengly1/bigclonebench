public class BigbenchClone{    
    public LUT getChannelLut() {
        int c = getChannelIndex();
        return lut[c];
    }
}