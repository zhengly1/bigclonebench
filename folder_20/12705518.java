public class BigbenchClone{    
    public boolean containsField(int stateFieldNo) {
        throw BindingSupportImpl.getInstance().invalidOperation("Not allowed to read/write to a instance marked for deletion");
    }
}