public class BigbenchClone{    
    public synchronized int getChannel(int tunerNumber) {
        return tunedChannels[tunerNumber].getNumber();
    }
}