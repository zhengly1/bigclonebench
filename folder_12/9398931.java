public class BigbenchClone{    
    public void testGetResource_FileOutsideOfClasspath_NotFound() throws Exception {
        URL url = loader.getResource("file:" + System.currentTimeMillis());
        assertNotNull("URL should not be null", url);
        url.openStream();
    }
}