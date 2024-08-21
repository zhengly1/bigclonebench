public class BigbenchClone{    
    public byte[] getDigest() throws NoSuchAlgorithmException {
        MessageDigest digest = CMSSignedHelper.INSTANCE.getDigestInstance(alg, provider);
        return digest.digest(data);
    }
}