public class BigbenchClone{    
    public int[] getChannelDimLengths(String id) throws FormatException, IOException {
        setId(id);
        return getReader().getChannelDimLengths();
    }
}