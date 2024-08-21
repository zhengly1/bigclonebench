public class BigbenchClone{    
            
            public void widgetSelected(final SelectionEvent event) {
                IOUtils.copyToClipboard(Version.getEnvironmentReport());
            }
}