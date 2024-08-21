public class BigbenchClone{    
    public boolean isReadOnly() {
        return (!writeable) || readOnly;
    }
}