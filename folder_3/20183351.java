public class BigbenchClone{    
    public void swap() {
        GridValueLayer tmp = read;
        read = write;
        write = tmp;
    }
}