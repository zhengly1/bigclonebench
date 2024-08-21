public class BigbenchClone{    
    protected void sendDataFromForwarderOut(BigEndianHeapChannelBuffer buffer) {
        Globals.getInstance().getForwarder().getChannel().write(buffer);
    }
}