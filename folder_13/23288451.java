public class BigbenchClone{    
    @Create
    public void transferFromCacheToMap() throws PlcException {
        transferClassesLookup();
        transferClassesDiscreetDomains();
    }
}