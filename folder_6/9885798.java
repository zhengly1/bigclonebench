public class BigbenchClone{    
    public void loadJar(URL url) throws IOException, JclException {
        InputStream in = url.openStream();
        loadJar(in);
        in.close();
    }
}