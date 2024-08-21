public class BigbenchClone{    
    public synchronized long writePendingCount() {
        return writeCount - readCount;
    }
}