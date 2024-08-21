public class BigbenchClone{    
        public void stop() {
            running = false;
            writerThread.interrupt();
        }
}