public class BigbenchClone{    
    public static final String hash(String data) {
        MessageDigest digest = null;
        if (digest == null) {
            try {
                digest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException nsae) {
                System.err.println("Failed to load the MD5 MessageDigest. " + "Jive will be unable to function normally.");
                nsae.printStackTrace();
            }
        }
        digest.update(data.getBytes());
        return encodeHex(digest.digest());
    }
}