public class BigbenchClone{    
    public void say(String messageForAllChannels) {
        for (Channel ch : session.getChannels()) {
            ch.say(messageForAllChannels);
        }
    }
}