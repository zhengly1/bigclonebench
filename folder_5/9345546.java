public class BigbenchClone{    
    void addToStayAlive(ChatPartner cp) {
        stayAliveSender.addStayAlive(cp.getChannel(), cp.getUsedAddress());
    }
}