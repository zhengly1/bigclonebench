public class BigbenchClone{    
    private void seek(long pos) throws IOException {
        file.getChannel().position(pos);
    }
}