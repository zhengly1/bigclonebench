public class BigbenchClone{    
    public boolean isOpen() {
        return readSink.isOpen() && writeSink.isOpen();
    }
}