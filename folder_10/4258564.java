public class BigbenchClone{    
    public Collection getChannelUsers() {
        return Collections.unmodifiableCollection(users.values());
    }
}