public class BigbenchClone{    
    
    protected void copy(InputStream inputs, OutputStream outputs) throws IOException {
        IOUtils.copy(inputs, outputs);
    }
}