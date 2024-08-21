public class BigbenchClone{    
    public static AgiChannel getChannel() {
        return AgiConnectionHandler.channel.get();
    }
}