public class BigbenchClone{    
    private void connect() throws IOException {
        conn = (HttpURLConnection) url.openConnection();
        getResponseHeaders();
    }
}