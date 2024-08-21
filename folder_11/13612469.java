public class BigbenchClone{    
    
    SelectableChannel getChannel() {
        assert isTransportLayerThread();
        return channel_;
    }
}