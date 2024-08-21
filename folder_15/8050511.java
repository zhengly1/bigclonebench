public class BigbenchClone{    
    public boolean supportsInbound() {
        return "true".equals(getChannelAttributeValue("supportsinbound"));
    }
}