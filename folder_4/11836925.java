public class BigbenchClone{    
    public boolean eof() throws IOException {
        return file.length() == fis.getChannel().position();
    }
}