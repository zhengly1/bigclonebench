public class BigbenchClone{    
    
    public void writeTo(OutputStream outstream) throws IOException {
        IOUtils.copy(entry.getContent().getInputStream(), outstream);
    }
}