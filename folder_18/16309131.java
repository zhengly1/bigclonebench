public class BigbenchClone{    
    public void setPassword(String password) {
        _password = Digester.digest(password);
    }
}