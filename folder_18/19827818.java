public class BigbenchClone{    
    public byte[] berechnen() {
        byte[] hash = md.digest();
        md.reset();
        return hash;
    }
}