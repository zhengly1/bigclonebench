public class BigbenchClone{    
    public void setLayout(URL url) throws SAXException, IOException {
        setLayout(url.openStream());
    }
}