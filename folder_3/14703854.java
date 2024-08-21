public class BigbenchClone{    
    public String getTitleImg() {
        ChannelExt ext = getChannelExt();
        if (ext != null) {
            return ext.getTitleImg();
        } else {
            return null;
        }
    }
}