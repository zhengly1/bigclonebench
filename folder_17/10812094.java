public class BigbenchClone{    
    public final Channel findChannel(String name) {
        return ScriptVars.curConnection.getChannel(name);
    }
}