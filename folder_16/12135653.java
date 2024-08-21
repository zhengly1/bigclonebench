public class BigbenchClone{    
    public static URL createFacelectUrl(String viewId) {
        try {
            return new URL(null, PROTOCOL + viewId, new URLStreamHandler() {

                
                protected URLConnection openConnection(URL url) throws IOException {
                    return new URLConnection(url) {

                        
                        public void connect() throws IOException {
                        }

                        
                        public InputStream getInputStream() throws IOException {
                            ThemeResource f = getFacelet(getURL().getFile());
                            return new ByteArrayInputStream(f.getText().getBytes());
                        }
                    };
                }
            });
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}