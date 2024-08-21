public class BigbenchClone{    
    public int exec(String application) throws AgiException {
        return getChannel().exec(application);
    }
}