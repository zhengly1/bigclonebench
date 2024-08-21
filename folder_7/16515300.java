public class BigbenchClone{    
    public Object getChannel() {
        return (Object) eGet(EnginePackage.Literals.PORT__CHANNEL, true);
    }
}