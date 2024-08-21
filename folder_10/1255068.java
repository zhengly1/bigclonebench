public class BigbenchClone{    
    
    protected PrintableFigure createPrintableFigure() {
        if (myGraphicalViewer != null) {
            LayerManager layerManager = (LayerManager) myGraphicalViewer.getEditPartRegistry().get(LayerManager.ID);
            IFigure contentLayer = layerManager.getLayer(LayerConstants.PRIMARY_LAYER);
            IFigure connectionLayer = layerManager.getLayer(LayerConstants.CONNECTION_LAYER);
            Dimension size = ((AbstractGraphicalEditPart) myGraphicalViewer.getRootEditPart().getContents()).getFigure().getSize();
            return new DiagramPrintableFigure(contentLayer, connectionLayer, size);
        }
        return null;
    }
}