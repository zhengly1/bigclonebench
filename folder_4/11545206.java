public class BigbenchClone{    
    public void propertyDescriptorConstructorShouldPreventReadMethodWithVoidReturnType() throws Exception {
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(PROPERTY_NAME, readMethodWithVoidReturnType, writeMethod);
        new PropertyDescriptorPropertyInformation(propertyDescriptor);
    }
}