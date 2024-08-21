public class BigbenchClone{    
    public void test_getChannel() throws Exception {
        if (tmpDir == null) {
            throw new Exception("System property java.io.tmpdir not defined.");
        }
        File tmpfile = File.createTempFile("FileOutputStream", "tmp");
        tmpfile.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(tmpfile);
        byte[] b = new byte[10];
        for (int i = 10; i < b.length; i++) {
            b[i] = (byte) i;
        }
        fos.write(b);
        fos.flush();
        fos.close();
        FileOutputStream f = new FileOutputStream(tmpfile, true);
        assertEquals(10, f.getChannel().position());
    }
}