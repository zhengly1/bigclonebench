public class BigbenchClone{    
    protected void transferEnumId(Input input, Output output, int fieldNumber) throws IOException {
        output.writeUInt32(fieldNumber, input.readUInt32(), false);
    }
}