public class BigbenchClone{    
        
        protected URLConnection openConnection(URL url) throws IOException {
            return new ProxyURLConnection(url, _proxied);
        }
}