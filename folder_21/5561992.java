public class BigbenchClone{    
    protected URLConnection openConnection(URL url) throws IOException {
        return realHandlerService.openConnection(url);
    }
}