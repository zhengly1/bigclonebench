public class BigbenchClone{    
    protected byte[] computeSHAdigest(final byte[] value) {
        try {
            return MessageDigest.getInstance("SHA").digest(value);
        } catch (Exception e) {
            throw new UnsupportedOperationException(e.toString());
        }
    }
}