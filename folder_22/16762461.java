public class BigbenchClone{    
    
    public void connect() {
        try {
            connection.connect();
            connection.login(id.getLogin(), id.getPass());
        } catch (XMPPException e) {
            e.printStackTrace();
        }
        presence();
    }
}