public class BigbenchClone{    
    
    public Annotation[] getAnnotations() {
        return reader == null ? writer.getAnnotations() : reader.getAnnotations();
    }
}