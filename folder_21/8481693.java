public class BigbenchClone{    
    public void parse(URL url) throws IOException {
        this.parse(url.openStream());
    }
}