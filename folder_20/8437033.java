public class BigbenchClone{    
    public void testSaveError() throws Exception {
        FileOutputStream stream = null;
        FileLock lock = null;
        try {
            File theFile = new File(getTestDirectory(), OUTPUT_JAD_FILE);
            stream = new FileOutputStream(theFile);
            lock = stream.getChannel().lock();
            executeBuildExceptionTarget("SignTaskTest.testIOError");
            assertExceptionMessageContains("IOException");
        } finally {
            lock.release();
            stream.close();
        }
    }
}