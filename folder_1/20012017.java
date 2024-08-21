public class BigbenchClone{    
    public void writeTo(OutputStream output) throws IOException {
        IOUtils.copyAndClose(stream, output);
    }
}