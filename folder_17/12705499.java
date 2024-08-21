public class BigbenchClone{    
    public void updateFrom(State state) {
        throw BindingSupportImpl.getInstance().invalidOperation("Not allowed to read/write to a instance marked for deletion");
    }
}