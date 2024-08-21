public class BigbenchClone{    
    protected void shutdown() {
        reader.stopThread();
        writer.stopThread();
        this.interrupt();
    }
}