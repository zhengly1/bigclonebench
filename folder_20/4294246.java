public class BigbenchClone{    
    boolean removeDevice(UPBLinkDevice theLinkedDevice) {
        return removeDevice(theLinkedDevice.getDevice(), theLinkedDevice.getChannel());
    }
}