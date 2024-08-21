public class BigbenchClone{    
    
    public void write(int b) {
        getOutputStreamForCurrentThread().write(b);
    }
}