public class BigbenchClone{    
    public ResponseType spmlDeleteRequest(DeleteRequestType request) {
        try {
            return (ResponseType) mediator.sendMessage(request, doMakeDestination(request), psp.getChannel());
        } catch (IdentityMediationException e) {
            throw new RuntimeException(e);
        }
    }
}