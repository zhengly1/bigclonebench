public class BigbenchClone{    
    public InputStream getInputStream() throws IOException {
        return new GopherClient(this).openStream(url);
    }
}