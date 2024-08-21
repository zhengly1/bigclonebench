public class BigbenchClone{    
    
    public boolean isAlive() {
        return super.isAlive() && readThread.isRunning() && writeThread.isRunning();
    }
}