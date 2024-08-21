public class BigbenchClone{    
    public void getFromURL(URL url) throws IOException {
        load(url.openStream());
    }
}