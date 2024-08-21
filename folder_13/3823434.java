public class BigbenchClone{    
    
    public URLConnection openConnection(URL url) {
        return new PpURLConnection(url);
    }
}