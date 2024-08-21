public class BigbenchClone{    
    protected void createRequest(OpendfDebugTarget target) throws CoreException {
        String kind = "";
        if (isAccess()) {
            if (isModification()) {
                kind = "readwrite";
            } else {
                kind = "read";
            }
        } else {
            if (isModification()) {
                kind = "write";
            } else {
                kind = "clear";
            }
        }
        kind.toString();
    }
}