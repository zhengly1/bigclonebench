public class BigbenchClone{    
    private Channel readChannel() throws IOException {
        int channelId = _in.readUnsignedShort();
        return getChannel(channelId);
    }
}