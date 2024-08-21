public class BigbenchClone{    
    public synchronized int available() {
        return writepos - readpos;
    }
}