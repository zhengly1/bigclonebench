public class BigbenchClone{    
    public void setAutoHangup(int time) throws AgiException {
        getChannel().setAutoHangup(time);
    }
}