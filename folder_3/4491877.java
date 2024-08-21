public class BigbenchClone{    
    
    public void beginWrite() {
        readWriteLock.writeLock().lock();
    }
}