public class BigbenchClone{    
    public static void copyFile(String sourceFile, String aimFile) {
        writeFile(readFileContent(sourceFile), aimFile);
    }
}