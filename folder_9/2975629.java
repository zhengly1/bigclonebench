public class BigbenchClone{    
    public AbstractFormat getFormat(boolean readable) {
        return readable ? writeFormat : displayFormat;
    }
}