public class BigbenchClone{    
    public synchronized HttpURLConnection build() throws IOException {
        return (HttpURLConnection) new URL(urlBuilder.toString()).openConnection();
    }
}