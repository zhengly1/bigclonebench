public class BigbenchClone{    
    public String toString() {
        return "MainConnection( " + ((TCPSession) getChannel().getSession()).getSocket() + " )";
    }
}