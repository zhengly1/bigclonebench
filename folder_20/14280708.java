public class BigbenchClone{    
    public void speechUnloadGrammar(String name) throws AgiException {
        getChannel().speechUnloadGrammar(name);
    }
}