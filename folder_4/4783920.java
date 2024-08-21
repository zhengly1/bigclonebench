public class BigbenchClone{    
                public Iterable<Iterable<IAction>> buildToolbar(GraphicalViewer graphicalViewer) {
                    ArrayList<Iterable<IAction>> toolbar = new ArrayList<Iterable<IAction>>();
                    ArrayList<IAction> navigateActions = new ArrayList<IAction>();
                    navigateActions.add(new RefreshAction(myRefreshPerformer));
                    navigateActions.add(new ExpandAction(myModelProvider));
                    navigateActions.add(new CollapseAction(myModelProvider));
                    toolbar.add(navigateActions);
                    ArrayList<IAction> zoomActions = new ArrayList<IAction>();
                    zoomActions.add(new ZoomInAction(editorContext.getElementEditor(), graphicalViewer));
                    zoomActions.add(new ZoomOutAction(editorContext.getElementEditor(), graphicalViewer));
                    zoomActions.add(new ZoomFitAction(editorContext.getElementEditor(), graphicalViewer));
                    zoomActions.add(new ZoomOriginalAction(editorContext.getElementEditor(), graphicalViewer));
                    toolbar.add(zoomActions);
                    ArrayList<IAction> filterActions = new ArrayList<IAction>();
                    filterActions.add(new FilterAction(editorContext.getElementEditor(), FILTER_ITEMS));
                    toolbar.add(filterActions);
                    ArrayList<IAction> printActions = new ArrayList<IAction>();
                    printActions.add(new PrintAction(editorContext.getElementEditor(), graphicalViewer));
                    toolbar.add(printActions);
                    return toolbar;
                }
}