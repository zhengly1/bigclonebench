public class BigbenchClone{    
            public void readEventPerformed(EEGReadEvent e) {
                values.addAll(e.getChannels());
            }
}