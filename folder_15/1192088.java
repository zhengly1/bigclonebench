public class BigbenchClone{    
    public int getChannelCount() {
        return vorbisInfo == null ? -1 : vorbisInfo.channels;
    }
}