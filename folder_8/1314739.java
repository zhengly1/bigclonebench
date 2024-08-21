public class BigbenchClone{    
    public Channel getChannelAt(int index) {
        if (_results == null) return null;
        return (Channel) _results.elementAt(index);
    }
}