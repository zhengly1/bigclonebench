public class BigbenchClone{    
    public String getVariable(String name) throws AgiException {
        return getChannel().getVariable(name);
    }
}