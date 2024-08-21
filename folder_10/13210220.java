public class BigbenchClone{    
    private synchronized byte[] getDigest(byte[] val) {
        return md.digest(val);
    }
}