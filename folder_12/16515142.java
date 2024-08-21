public class BigbenchClone{    
    
    public String toString() {
        return getClass().getSimpleName() + '(' + "ridx=" + readerIndex + ", " + "widx=" + writerIndex + ", " + "cap=" + capacity() + ')';
    }
}