public class BigbenchClone{    
    public static Document getHtmlDocument(URL url) throws IOException, SAXException {
        return getHtmlDocument(url.openConnection());
    }
}