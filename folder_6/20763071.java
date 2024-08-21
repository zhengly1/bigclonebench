public class BigbenchClone{
    public void test_read_2() throws Exception {
        Thread writerThread;
        PipedWriter pw;
        PWriter2 pwriter;
        preader = new PipedReader();
        pw = new PipedWriter(preader);
        writerThread = new Thread(pwriter = new PWriter2(pw), "PWriter2");
        writerThread.start();
        Thread.sleep(500);
        preader.read();
        assertEquals("Test 1: No more data indication expected. ", -1, preader.read());
        pwriter.keepRunning = false;
    }
}