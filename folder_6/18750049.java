public class BigbenchClone{    
    public int bytesAvailable() {
        return writeCursor - readCursor;
    }
}