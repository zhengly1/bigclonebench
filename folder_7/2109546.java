public class BigbenchClone{    
    VGChannel<NodeType, PortType, SignalType> getChannel(int aIdx) {
        return fChannels.get(aIdx);
    }
}