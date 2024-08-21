public class BigbenchClone{    
    public void writeTo(OutputStream out) throws IOException {
        IOUtils.copy(getInputStream(), out);
    }
}