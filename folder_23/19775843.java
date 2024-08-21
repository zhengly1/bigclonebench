public class BigbenchClone{    
    public static Document getDocument(DocumentBuilder db, String urlString) {
        try {
            URL url = new URL(urlString);
            try {
                URLConnection URLconnection = url.openConnection();
                HttpURLConnection httpConnection = (HttpURLConnection) URLconnection;
                int responseCode = httpConnection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    InputStream in = httpConnection.getInputStream();
                    try {
                        Document doc = db.parse(in);
                        return doc;
                    } catch (org.xml.sax.SAXException e) {
                    }
                }
            } catch (IOException e) {
            }
        } catch (MalformedURLException e) {
        }
        return null;
    }
}