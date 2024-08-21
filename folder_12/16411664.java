public class BigbenchClone{    
    public static byte[] sha(byte[] data) {
        return getShaDigest().digest(data);
    }
}