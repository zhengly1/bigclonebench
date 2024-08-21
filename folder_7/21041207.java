public class BigbenchClone{    
    int numPending() {
        return writePtr - readPtr;
    }
}