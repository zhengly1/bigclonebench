public class BigbenchClone{    
    public Vector getMembers() {
        this.assertStarted();
        return getChannel().getView().getMembers();
    }
}