public class BigbenchClone{    
    private boolean getFileChecksums() {
        return (writeLocalFileChecksum() && readRemoteFileChecksum());
    }
}