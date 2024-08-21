public class BigbenchClone{    
    public ServletOutputStream getOutputStream() {
        if (writerWasUsed) throw new IllegalStateException("getWriter() already called");
        streamWasUsed = true;
        return sos;
    }
}