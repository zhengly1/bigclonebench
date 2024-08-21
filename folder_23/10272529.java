public class BigbenchClone{    
    public String getHash(byte[] bytes) {
        md.reset();
        return toHex(md.digest(bytes));
    }
}