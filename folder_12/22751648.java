public class BigbenchClone{    
    public void setRandomAccessFile(RandomAccessFile raf) {
        if (next == null) readwrite = raf; else next.setRandomAccessFile(raf);
    }
}