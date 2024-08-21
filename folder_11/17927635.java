public class BigbenchClone{    
    public int availableForPut() {
        return dataSize - (writePosition - readPosition);
    }
}