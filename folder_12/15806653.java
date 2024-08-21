public class BigbenchClone{    
    
    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {
        channels.add(e.getChannel());
    }
}