public class BigbenchClone{    
    public static InputStream getDocumentAsInputStream(URL url) throws IOException {
        return url.openStream();
    }
}