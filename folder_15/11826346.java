public class BigbenchClone{    
    public void copyAssetFile(String srcFileName, String targetFilePath) {
        AIOUtils.copyAssetFile(mCtx, srcFileName, storagePath(targetFilePath));
    }
}