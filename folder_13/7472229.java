public class BigbenchClone{    
    public int[] getChannelDimLengths(String id) throws FormatException, IOException {
        reader.setId(id);
        return reader.getChannelDimLengths();
    }
}