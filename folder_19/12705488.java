public class BigbenchClone{    
    public void setObjectFieldUnresolved(int field, Object newValue) {
        throw BindingSupportImpl.getInstance().invalidOperation("Not allowed to read/write to a instance marked for deletion");
    }
}