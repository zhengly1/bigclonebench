public class BigbenchClone{    
    public double getDoubleField(int stateFieldNo) {
        throw BindingSupportImpl.getInstance().invalidOperation("Not allowed to read/write to a instance marked for deletion");
    }
}