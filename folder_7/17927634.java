public class BigbenchClone{    
    public int availableForGet() {
        return writePosition - readPosition;
    }
}