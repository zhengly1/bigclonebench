public class BigbenchClone{    
    
    protected URLConnection openConnection(URL url) throws IOException {
        return new Sftp3gppUrlConnection(url);
    }
}