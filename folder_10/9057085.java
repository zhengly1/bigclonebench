public class BigbenchClone{    
    public UndoableChannelGeneric endUndo() {
        this.redoCaret = new UndoableCaretHelper();
        this.redoChannels = getChannels();
        return this;
    }
}