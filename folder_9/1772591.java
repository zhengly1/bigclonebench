public class BigbenchClone{    
            public void actionPerformed(ActionEvent e) {
                new ChannelPropertiesDialog(getMainframe(), GlobalModel.SINGLETON.getChannelGuideSet().selectedGuide().selectedCGE()).open();
            }
}