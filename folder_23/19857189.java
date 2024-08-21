public class BigbenchClone{    
    private static InputStream executeQuery(String url) throws MalformedURLException, IOException {
        InputStream data = null;
        try {
            data = (new URL(url)).openStream();
        } catch (UnknownHostException e) {
            logger.warn("Impossible to get elevation from GMap: maybe no connection to the Internet?");
        }
        return data;
    }
}