public class BigbenchClone{    
    public Object read(MarshallerFamily mf, StatefulBuffer writer, boolean redirect) throws CorruptionException {
        return mf._primitive.readFloat(writer);
    }
}