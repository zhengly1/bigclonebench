public class BigbenchClone{    
    public boolean isAlsoReadwriteField(final String name) {
        return this.readwriteParameterNames.contains(name);
    }
}