public class BigbenchClone{    
    public static GDataDemoInfo init() {
        return new GDataDemoInfo() {

            
            public GDataDemo createInstance() {
                return new GoogleBaseRetrieveMediaDemo();
            }

            
            public String getDescription() {
                return "<p>This sample uses the private, read/write media feed " + "to query an item's attached media. Each item has an associated " + "media feed which can contain up to 10 binary attachments. Use " + "this feed to manage binary attachments for your Google Base " + "items. Google Base creates a set of thumbnails for each " + "attachment, and stores the thumbnails on the Google Base " + "server.</p>";
            }

            
            public String getName() {
                return "Base - Retrieving media";
            }
        };
    }
}