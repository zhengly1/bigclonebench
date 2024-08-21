public class BigbenchClone{    
    public static final FileChannel getInputChannel(File file) {
        return FileUtil.getInputStream(file).getChannel();
    }
}