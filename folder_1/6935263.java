public class BigbenchClone{    
    public boolean isEmpty() {
        return writeIndex == readIndex;
    }
}