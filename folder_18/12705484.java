public class BigbenchClone{    
    public boolean isDirty(int fieldNo) {
        throw BindingSupportImpl.getInstance().invalidOperation("Not allowed to read/write to a instance marked for deletion");
    }
}