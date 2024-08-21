public class BigbenchClone{    
    @Parameterized.Parameters
    public static List<Object[]> data() {
        return TestProperties.getParameterList("webdav.readwrite.uri");
    }
}