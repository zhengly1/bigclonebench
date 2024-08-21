public class BigbenchClone{    
    public Integer getTitleImgWidth() {
        ChannelExt ext = getChannelExt();
        if (ext != null) {
            return ext.getTitleImgWidth();
        } else {
            return null;
        }
    }
}