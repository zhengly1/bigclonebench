public class BigbenchClone{    
    public final CharSequence getUnsuscribeScript() {
        return "dojox.cometd.unsubscribe('/" + getChannelId() + "');\n";
    }
}