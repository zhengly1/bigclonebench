public class BigbenchClone{    
        public synchronized int available() {
            return closed ? 0 : writePos - readPos;
        }
}