public class BigbenchClone{    
    protected void setGraphicalViewer(GraphicalViewer viewer) {
        getEditDomain().addViewer(viewer);
        this.graphicalViewer = viewer;
    }
}