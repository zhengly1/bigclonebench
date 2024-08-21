public class BigbenchClone{    
    public void setBrowserSaveListener(KBrowserDataWriterInterface dataWriterParam) {
        dataWriter = dataWriterParam;
        log.log(this, "Set browser read and write ");
    }
}