public class BigbenchClone{    
    private GraphicalViewer getGraphicalViewer() {
        return (GraphicalViewer) dashboardEditor.getAdapter(GraphicalViewer.class);
    }
}