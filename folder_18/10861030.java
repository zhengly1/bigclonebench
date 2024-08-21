public class BigbenchClone{    
    public Tree loadTree(URL url) throws IOException {
        return loadTree(url.openStream());
    }
}