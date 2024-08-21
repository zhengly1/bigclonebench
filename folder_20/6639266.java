public class BigbenchClone{    
    public String toString() {
        return getBoardIdentifier() + "-" + getCommChannel().getChannelName() + "(" + this.getAddress() + ")";
    }
}