public class BigbenchClone{    
                
                public void doEdit() {
                    new DommainEditAction((GraphicalViewer) UIUtils.getActiveEditor().getAdapter(GraphicalViewer.class)).run();
                }
}