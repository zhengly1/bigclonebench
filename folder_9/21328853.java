public class BigbenchClone{    
    public void setLogLevel(Level level) throws Exception {
        TegsoftPBX.setLogLevel(getChannel(), level);
    }
}