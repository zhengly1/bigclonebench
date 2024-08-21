public class BigbenchClone{    
    public int getChannel() {
        return packedMsg & 0x0F;
    }
}