public class BigbenchClone{    
    public boolean isStopped() {
        return reader.isStopped() || writer.isStopped();
    }
}