public class BigbenchClone{    
    public boolean readable() {
        return write_index > read_index;
    }
}