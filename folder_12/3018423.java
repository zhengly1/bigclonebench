public class BigbenchClone{    
    public void setInput(SliceReader writer) {
        reader.destroy();
        reader = writer;
    }
}