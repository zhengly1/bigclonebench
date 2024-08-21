public class BigbenchClone{    
    private boolean getFileAccess() {
        return (writeLocalFileAccess() && readRemoteFileAccess());
    }
}