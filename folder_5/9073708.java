public class BigbenchClone{    
    public boolean selfTest() {
        if (valid == null) {
            Sha256 md = new Sha256();
            md.update((byte) 0x61);
            md.update((byte) 0x62);
            md.update((byte) 0x63);
            String result = Util.toString(md.digest());
            valid = Boolean.valueOf(DIGEST0.equals(result));
        }
        return valid.booleanValue();
    }
}