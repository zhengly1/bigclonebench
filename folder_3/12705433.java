public class BigbenchClone{    
    public void setInternalByteFieldAbs(int field, byte newValue) {
        throw BindingSupportImpl.getInstance().invalidOperation("Not allowed to read/write to a instance marked for deletion");
    }
}