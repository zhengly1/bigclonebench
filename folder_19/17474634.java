public class BigbenchClone{    
    public void getReadLock() {
        synchronized (lockObj) {
            while ((writeLockIssued) || (threadsWaitingForWriteLock != 0)) {
                try {
                    lockObj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            totalReadLocksGiven++;
        }
    }
}