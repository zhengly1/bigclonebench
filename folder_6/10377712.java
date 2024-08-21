public class BigbenchClone{    
    protected HttpURLConnection getHttpUrlConnection(URL urlForServlet) throws IOException {
        return (HttpURLConnection) urlForServlet.openConnection();
    }
}