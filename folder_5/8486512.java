public class BigbenchClone{    
    protected InputStream getInputStream(URL url) throws IOException {
        return url.openStream();
    }
}