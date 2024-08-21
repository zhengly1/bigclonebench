public class BigbenchClone{    
    public JPanel makeControlPanel() {
        JPanel controlPanel = new JPanel();
        sclTableModel = new SCLTableModel(myDoc);
        start = new JButton("Start");
        ;
        stop = new JButton("Stop");
        reset = new JButton("Reset");
        ;
        run = new JButton("RUN");
        calibrate = new JButton("COMP");
        tfmon = new JTextField(5);
        msrcav = new SCLCmMeasure(myDoc);
        sclTable = new JTable(sclTableModel);
        start.setEnabled(true);
        start.addActionListener(this);
        stop.setEnabled(false);
        stop.addActionListener(this);
        reset.setEnabled(false);
        reset.addActionListener(this);
        run.setEnabled(false);
        run.addActionListener(this);
        calibrate.setEnabled(false);
        calibrate.addActionListener(this);
        controlPanel.setLayout(new BorderLayout());
        JScrollPane sp = new JScrollPane(sclTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JPanel controls = new JPanel(new GridLayout(5, 5, 6, 7));
        JLabel dummy1 = new JLabel("");
        JLabel dummy2 = new JLabel("");
        JLabel dummy3 = new JLabel("");
        JLabel dummy4 = new JLabel("");
        JLabel dummy5 = new JLabel("");
        JLabel dummy6 = new JLabel("");
        JLabel dummy7 = new JLabel("");
        JLabel dummy8 = new JLabel("");
        JLabel dummy9 = new JLabel("");
        JLabel dummya = new JLabel("");
        JLabel dummyb = new JLabel("");
        JLabel dummyc = new JLabel("");
        JLabel dummyd = new JLabel("");
        JLabel dummye = new JLabel("");
        JLabel dummyf = new JLabel("");
        JLabel dummyg = new JLabel("");
        JLabel dummyh = new JLabel("");
        controls.add(dummy1);
        controls.add(dummy2);
        controls.add(dummy3);
        controls.add(dummy4);
        controls.add(dummy5);
        controls.add(start);
        controls.add(dummy6);
        controls.add(stop);
        controls.add(dummy7);
        controls.add(reset);
        controls.add(run);
        controls.add(dummy8);
        controls.add(tfmon);
        controls.add(dummya);
        controls.add(calibrate);
        controls.add(inEnergy);
        controls.add(tfEin);
        controls.add(dummyb);
        controls.add(outEnergy);
        controls.add(tfEout);
        controls.add(dummyc);
        controls.add(dummyd);
        controls.add(dummye);
        controls.add(dummyf);
        controls.add(dummyg);
        controls.setVisible(true);
        controlPanel.add(controls, BorderLayout.NORTH);
        controlPanel.add(sp, BorderLayout.CENTER);
        nf.setMaximumFractionDigits(2);
        dEin = myDoc.energy[0];
        tfEin.setText(nf.format(dEin));
        controlPanel.setVisible(true);
        String[] amp = new String[myDoc.numberOfCav];
        String[] phs = new String[myDoc.numberOfCav];
        for (int i = 0; i < myDoc.numberOfCav; i++) {
            amp[i] = myDoc.cav[i].channelSuite().getChannel("cavAmpSet").getId().substring(0, 16) + "Field_WfA";
            phs[i] = myDoc.cav[i].channelSuite().getChannel("cavAmpSet").getId().substring(0, 16) + "Field_WfP";
        }
        if (msrcav.setPV1(phs) && msrcav.setPV2(amp)) {
            myDoc.stopped = true;
        }
        return controlPanel;
    }
}