public class BigbenchClone{    
     
    public void digestInfo() throws Exception {
        byte[] message = "hello world".getBytes();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        byte[] digest = messageDigest.digest(message);
        LOG.debug("Digest: " + new String(Hex.encodeHex(digest)));
        DERObjectIdentifier hashAlgoId = OIWObjectIdentifiers.idSHA1;
        DigestInfo digestInfo = new DigestInfo(new AlgorithmIdentifier(hashAlgoId), digest);
        byte[] encodedDigestInfo = digestInfo.getEncoded();
        LOG.debug("Digest Info: " + new String(Hex.encodeHex(encodedDigestInfo)));
    }
}