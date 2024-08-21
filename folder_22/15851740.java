public class BigbenchClone{    
    public UpdateOverwriteFiles getOverwriteFiles() {
        return findUpdatesThread == null ? null : findUpdatesThread.overwriteFiles;
    }
}