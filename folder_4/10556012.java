public class BigbenchClone{    
    
    public String toString() {
        if (getNameIdPair() == null) {
            return getChannel().toString();
        }
        return "(" + getNameIdPair() + ")" + getChannel();
    }
}