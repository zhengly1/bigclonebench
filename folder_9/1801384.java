public class BigbenchClone{    
    public synchronized CipherParameters getParameters() {
        return getChannel().getParameters();
    }
}