public class BigbenchClone{    
    private boolean getFileSizes() {
        return (writeLocalFileSize() && readRemoteFileSize());
    }
}