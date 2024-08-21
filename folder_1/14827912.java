public class BigbenchClone{    
    public void notifyChannelsAndItems() {
        Iterator chanIter = group.getChannels().iterator();
        while (chanIter.hasNext()) {
            notifyChannelsAndItems((Channel) chanIter.next());
        }
    }
}