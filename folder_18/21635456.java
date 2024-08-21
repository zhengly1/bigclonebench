public class BigbenchClone{    
        
        public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
            logger.info("outbound exception: {}", e.getCause().getMessage());
            closeOnFlush(e.getChannel());
        }
}