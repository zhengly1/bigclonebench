public class BigbenchClone{    
    public void speechCreate(String engine) throws AgiException {
        getChannel().speechCreate(engine);
    }
}