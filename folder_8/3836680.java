public class BigbenchClone{    
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
        chooser.setAcceptAllFileFilterUsed(true);
        chooser.setFileFilter(new FileFilter() {

            
            public boolean accept(File f) {
                return f.isDirectory() || f.getAbsolutePath().toUpperCase().endsWith(".XML");
            }

            
            public String getDescription() {
                return "XML files";
            }
        });
        int resp = chooser.showSaveDialog(ConnectionSetupPanel.this);
        if (resp != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File xmlFile = chooser.getSelectedFile();
        if (xmlFile.exists()) {
            resp = JOptionPane.showConfirmDialog(ConnectionSetupPanel.this, "The file '" + xmlFile.getName() + "' already exists.\n" + "Overwrite ?", "Please confirm...", JOptionPane.YES_NO_OPTION);
            if (resp != JOptionPane.YES_OPTION) {
                return;
            }
        }
        try {
            ConnectionSetupManager setupManager = ConnectionSetupManager.getInstance();
            SortedListModel<ConnectionSetup> model = (SortedListModel<ConnectionSetup>) listSavedConnections.getModel();
            for (int cpt = 0; cpt < model.getSize(); cpt++) {
                setupManager.addConnectionSetup(model.getElementAt(cpt));
            }
            String xml = setupManager.toXmlString();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(xmlFile));
            bos.write(xml.getBytes(), 0, xml.getBytes().length);
            bos.flush();
            bos.close();
            JOptionPane.showMessageDialog(ConnectionSetupPanel.this, "Sucessfully saved connection setups in '" + xmlFile.getName() + "'", "Yeah...", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            logger.error("Cannot export connection setups to xml file.", ex);
            JXErrorPane errorPane = new JXErrorPane();
            errorPane.setErrorInfo(new ErrorInfo("Error while exporting", "Cannot export connection setups to XML file.", null, "ERROR", ex, Level.SEVERE, null));
            JXErrorPane.showDialog(ConnectionSetupPanel.this, errorPane);
        }
    }
}