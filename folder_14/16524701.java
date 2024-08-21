public class BigbenchClone{    
    public void test_read_writeBoolean() throws IOException {
        os.writeBoolean(true);
        os.close();
        openObjectInputStream();
        assertTrue("Test 1: Incorrect boolean written or read.", is.readBoolean());
        try {
            is.readBoolean();
            fail("Test 2: EOFException expected.");
        } catch (EOFException e) {
        }
        is.close();
        try {
            is.readBoolean();
            fail("Test 3: IOException expected.");
        } catch (IOException e) {
        }
    }
}