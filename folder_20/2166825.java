public class BigbenchClone{    
    public Scene load(URL url) throws FileNotFoundException, IncorrectFormatException, ParsingErrorException {
        URL baseUrl = this.baseUrl;
        if (this.baseUrl == null) {
            baseUrl = url;
        }
        InputStream in;
        try {
            in = url.openStream();
        } catch (IOException ex) {
            throw new FileNotFoundException("Can't read " + url);
        }
        try {
            return load(new InputStreamReader(in, "ISO-8859-1"), baseUrl);
        } catch (UnsupportedEncodingException ex) {
            return load(new InputStreamReader(in));
        }
    }
}