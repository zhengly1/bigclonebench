public class BigbenchClone{    
    private void copyResources(String sourceDirectory, String destinationDirectory) throws Exception {
        File sd = new File(sourceDirectory);
        if (!sd.exists()) {
            return;
        }
        List files = FileUtils.getFiles(sd, "**/**", "**/CVS/**,**/.svn/**", false);
        for (Object file : files) {
            File f = (File) file;
            File source = new File(sourceDirectory, f.getPath());
            File dest = new File(destinationDirectory, f.getPath());
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            FileUtils.copyFile(source, dest);
        }
    }
}