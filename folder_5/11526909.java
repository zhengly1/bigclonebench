public class BigbenchClone{    
    public boolean isWritable() {
        return (!readOnly && writeLock.isLocked());
    }
}