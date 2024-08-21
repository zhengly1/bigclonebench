public class BigbenchClone{    
    private void getMeta(MessageEvent e) {
        initDoc(e.getChannel());
        writeFileResponse(e.getChannel());
    }
}