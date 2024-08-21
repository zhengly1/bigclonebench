public class BigbenchClone{    
    private void buildUI() {
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.addWindowListener(new WindowAdapter() {

            
            public void windowClosed(WindowEvent e) {
                if (databaseAdded) {
                    SPObject currentEditor = session.getWorkspace().getEditorPanelModel();
                    try {
                        final URI resource = WabitSwingSessionContextImpl.class.getResource(WabitSessionContext.NEW_WORKSPACE_URL).toURI();
                        URL importURL = resource.toURL();
                        URLConnection urlConnection = importURL.openConnection();
                        InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                        final OpenWorkspaceXMLDAO workspaceLoader = new OpenWorkspaceXMLDAO(context, in, urlConnection.getContentLength());
                        workspaceLoader.importWorkspaces(session);
                    } catch (Exception ex) {
                        throw new RuntimeException("Cannot find the templates file at " + "location " + WabitSessionContext.NEW_WORKSPACE_URL);
                    }
                    session.getWorkspace().setEditorPanelModel(currentEditor);
                    context.registerChildSession(session);
                }
                session.getWorkspace().removeDatabaseListChangeListener(workspaceDataSourceListener);
            }
        });
        DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("pref:grow"));
        final JLabel selectDSLabel = new JLabel("Select a data source for your new workspace.");
        selectDSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        builder.append(selectDSLabel);
        builder.nextLine();
        final JLabel additionalDSLabel = new JLabel("(Additional data sources can be added later.)");
        additionalDSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        builder.append(additionalDSLabel);
        builder.nextLine();
        builder.append(WorkspacePanel.createDBConnectionManager(session, dialog).getPanel());
        dialog.add(builder.getPanel());
    }
}