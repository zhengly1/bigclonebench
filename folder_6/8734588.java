public class BigbenchClone{    
    
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
        log.error("Caught exception " + e.getCause().getMessage());
        this.onExceptionCaught(e.getChannel(), e.getCause());
    }
}