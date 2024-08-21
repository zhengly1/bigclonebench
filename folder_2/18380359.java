public class BigbenchClone{    
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        diskCacheToken = diskCache.transferFromStream(stream);
    }
}