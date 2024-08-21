public class BigbenchClone{    
    
    protected URLConnection openConnection(final URL url) {
        return new AboutURLConnection(url);
    }
}