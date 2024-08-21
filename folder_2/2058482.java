public class BigbenchClone{    
    
    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent e) {
        RtspServerStackImpl.allChannels.add(e.getChannel());
    }
}