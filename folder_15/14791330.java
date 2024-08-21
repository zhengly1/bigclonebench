public class BigbenchClone{    
    private void initialise(String urlString) {
        try {
            URL url = new URL(urlString);
            BufferedInputStream buff = new BufferedInputStream(url.openStream());
            buildData(buff);
        } catch (IOException e) {
            System.err.println("AdminList: Error opening input stream to url: " + urlString);
            e.printStackTrace();
        }
    }
}