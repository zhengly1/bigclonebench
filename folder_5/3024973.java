public class BigbenchClone{    
     
    public void testCopy_inputStreamToOutputStream_IO84() throws Exception {
        long size = (long) Integer.MAX_VALUE + (long) 1;
        InputStream in = new NullInputStreamTest(size);
        OutputStream out = new OutputStream() {

            
            public void write(int b) throws IOException {
            }

            
            public void write(byte[] b) throws IOException {
            }

            
            public void write(byte[] b, int off, int len) throws IOException {
            }
        };
        assertEquals(-1, IOUtils.copy(in, out));
        in.close();
        assertEquals("copyLarge()", size, IOUtils.copyLarge(in, out));
    }
}