public class BigbenchClone{    
    public CobolBytes mapInput(long position, int size) throws IOException {
        return new CobolBytes(((FileInputStream) in).getChannel().map(MapMode.READ_WRITE, position, size).array());
    }
}