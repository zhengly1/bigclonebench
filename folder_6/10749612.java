public class BigbenchClone{    
    protected void writeLock() throws AccessPoemException {
        writeLock(PoemThread.sessionToken());
    }
}