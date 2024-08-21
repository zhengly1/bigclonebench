public class BigbenchClone{    
    public void flush() throws IOException {
        super.flush();
        getChannel().force(false);
    }
}