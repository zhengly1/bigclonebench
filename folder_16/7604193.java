public class BigbenchClone{    
    protected void initializeGraphicalViewer() {
        super.initializeGraphicalViewer();
        GraphicalViewer viewer = getGraphicalViewer();
        viewer.setContents(getModel());
        viewer.addDropTargetListener(createTransferDropTargetListener());
    }
}