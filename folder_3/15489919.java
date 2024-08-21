public class BigbenchClone{    
    
    public void copy(final UJO from, final UJO to) {
        to.writeValue(this, from.readValue(this));
    }
}