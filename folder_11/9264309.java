public class BigbenchClone{    
    public static byte[] md5Singleton(byte[] buff) throws NoSuchAlgorithmException {
        md5Obj.reset();
        return md5Obj.digest(buff);
    }
}