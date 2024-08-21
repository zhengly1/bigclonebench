public class BigbenchClone{    
    private void copyFile(File src, File dest) throws IOException {
        FileUtils.copyFile(src, dest);
        checksumCalculator.calculateForFile(dest);
    }
}