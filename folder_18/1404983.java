public class BigbenchClone{    
    public static void removeChannelListener(int id) {
        channelhandler.getChannel(id).addListener(null);
    }
}