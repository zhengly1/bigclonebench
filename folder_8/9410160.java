public class BigbenchClone{    
            public Object construct() {
                doClose(RET_OK);
                com.javable.dataview.DataChannel xchannel = null;
                com.javable.dataview.DataChannel ychannel = null;
                Vector proxies = new Vector();
                ifr = (DataFrame) desktop.getActiveFrame();
                if (ifr != null) {
                    stats = ifr.getStatsContent();
                    if ((stats == null) || replaceRadioButton.isSelected()) {
                        stats = new ViewContent();
                        ifr.setStatsContent(stats);
                    }
                    DataView view = ifr.getDataContent().getView();
                    source = view.getStorage();
                    result = stats.getStorage();
                    double r[] = regionSelector.getLimits(view);
                    xmin = r[0];
                    xmax = r[1];
                    String inf = "";
                    inf = regionSelector.getRegionComboBox().getSelectedItem() + ", Channel " + ychanTextField.getValue();
                    xres = new DataChannel(inf, source.getGroupsSize());
                    try {
                        for (int i = 0; i < source.getGroupsSize(); i++) {
                            DataGroup group = source.getGroup(i);
                            xchannel = source.getChannel(i, group.getXChannel());
                            ychannel = source.getChannel(i, ychanTextField.getValue());
                            if ((xchannel != null) && (ychannel != null) && (ychannel.getAttribute().isNormal())) {
                                xres.setData(i, i);
                                proxies.addElement(new ChannelStatsProxy());
                            }
                        }
                        channels = new Vector();
                        for (int k = 0; k < analysisTable.getModel().getRowCount(); k++) {
                            if (((Boolean) analysisTable.getValueAt(k, 1)).booleanValue()) {
                                inf = (String) analysisTable.getValueAt(k, 0);
                                yres = new DataChannel(inf, source.getGroupsSize());
                                int t = 0;
                                for (int i = 0; i < source.getGroupsSize(); i++) {
                                    DataGroup group = source.getGroup(i);
                                    xchannel = source.getChannel(i, group.getXChannel());
                                    ychannel = source.getChannel(i, ychanTextField.getValue());
                                    if ((xchannel != null) && (ychannel != null) && (ychannel.getAttribute().isNormal())) {
                                        proxy = (ChannelStatsProxy) proxies.get(t);
                                        yres.setData(i, getStat(k, xchannel, ychannel));
                                        t++;
                                    }
                                }
                                channels.add(yres);
                            }
                        }
                    } catch (Exception e) {
                    }
                }
                return ResourceManager.getResource("Done");
            }
}