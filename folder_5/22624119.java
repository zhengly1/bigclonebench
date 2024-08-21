public class BigbenchClone{    
    public void read(URL url) throws IOException, GifException {
        InputStream fin = url.openStream();
        read(fin);
    }
}