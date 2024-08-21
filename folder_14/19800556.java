public class BigbenchClone{    
    public void writeTo(OutputStream out) throws IOException {
        IOUtils.copy(new ByteArrayInputStream(tempFile), out);
    }
}