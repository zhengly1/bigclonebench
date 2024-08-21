public class BigbenchClone{    
    
    protected void channelIdle(ChannelHandlerContext ctx, IdleState state, long lastActivityTimeMillis) throws Exception {
        ctx.getChannel().disconnect();
    }
}