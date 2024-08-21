public class BigbenchClone{    
    public List<Channel> getChannels() {
        if (channels == null) {
            channels = new FastTable<Channel>();
        }
        return this.channels;
    }
}