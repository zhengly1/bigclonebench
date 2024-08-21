public class BigbenchClone{    
    protected InputStream getStream() {
        try {
            return new BufferedInputStream(url.openStream());
        } catch (IOException e) {
            return null;
        }
    }
}