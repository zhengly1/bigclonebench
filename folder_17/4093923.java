public class BigbenchClone{    
        protected SelectableChannel getChannel() {
            synchronized (sync) {
                return dch;
            }
        }
}