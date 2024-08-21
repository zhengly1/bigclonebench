public class BigbenchClone{    
    public String getName() {
        ChannelExt ext = getChannelExt();
        if (ext != null) {
            return ext.getName();
        } else {
            return null;
        }
    }
}