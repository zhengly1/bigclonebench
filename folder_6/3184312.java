public class BigbenchClone{    
    public float getAutoscaleYOffset(int xOffset, int xLength) {
        return -getChannelModel().getMaxSampleValue(xOffset, xLength);
    }
}