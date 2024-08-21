public class BigbenchClone{    
    
    public void print(float f) {
        try {
            writerListLock.readLock().lock();
            for (PrintWriter writer : writerList) {
                writer.print(f);
            }
        } finally {
            writerListLock.readLock().unlock();
        }
    }
}