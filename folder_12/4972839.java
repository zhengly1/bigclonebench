public class BigbenchClone{    
    public void wakeThreads() {
        readThread.interrupt();
        writeThread.interrupt();
    }
}