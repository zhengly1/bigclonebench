public class BigbenchClone{    
    public void flush() throws IOException {
        raf.getChannel().force(true);
    }
}