public class BigbenchClone{    
    
    SelectableChannel getChannel() {
        assert isTransportLayerThread();
        throw new UnsupportedOperationException("asynchronous connection not supported");
    }
}