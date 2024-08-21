public class BigbenchClone{    
    private boolean getFileStatus() {
        return (writeLocalFileStatus() && readRemoteFileStatus());
    }
}