public class BigbenchClone{    
    
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) {
        e.getChannel().write(firstMessage);
    }
}