public class BigbenchClone{    
    public AbstractIRCChannel getChannel(String name) {
        return this.channels.get(name);
    }
}