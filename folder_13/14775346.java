public class BigbenchClone{    
    private void claimWriteLock() {
        ++activeWriters;
        writerThread = Thread.currentThread();
        lockCount = 1;
    }
}