public class BigbenchClone{    
            public void run() {
                threadAssertFalse(lock.writeLock().tryLock());
            }
}