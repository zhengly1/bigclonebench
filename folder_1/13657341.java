public class BigbenchClone{    
    public OutputStream getOutputStream() throws IOException {
        return getChannel().getOutputStream();
    }
}