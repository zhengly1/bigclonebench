public class BigbenchClone{    
    public void test_getChannel() throws Exception {
        assertNull(new ServerSocket().getChannel());
    }
}