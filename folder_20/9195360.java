public class BigbenchClone{    
            public FileChannel createFileChannel() throws IOException {
                return new FileOutputStream(file.getAbsolutePath(), isAppend).getChannel();
            }
}