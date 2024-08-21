public class BigbenchClone{    
    void writeAllThreadsAsPart() throws IOException {
        writeHtmlHeader();
        htmlCoreReport.writeAllThreadsAsPart();
        writeHtmlFooter();
    }
}