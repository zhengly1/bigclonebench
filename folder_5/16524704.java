public class BigbenchClone{    
    public void test_read_writeDouble() throws IOException {
        os.writeDouble(2345.76834720202);
        os.close();
        openObjectInputStream();
        assertEquals("Test 1: Incorrect double written or read;", 2345.76834720202, is.readDouble());
        try {
            is.readDouble();
            fail("Test 2: EOFException expected.");
        } catch (EOFException e) {
        }
        is.close();
        try {
            is.readDouble();
            fail("Test 3: IOException expected.");
        } catch (IOException e) {
        }
    }
}