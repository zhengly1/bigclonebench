public class BigbenchClone{    
    public void flush() throws IOException {
        getChannel().force(true);
    }
}