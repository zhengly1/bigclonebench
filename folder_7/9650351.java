public class BigbenchClone{    
    public static void getChannelList(NetResponseListener listener) {
        forward(listener);
        myHandler.getChannelList();
    }
}