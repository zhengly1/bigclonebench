public class BigbenchClone{    
    protected synchronized int available() {
        return writepos - readpos;
    }
}