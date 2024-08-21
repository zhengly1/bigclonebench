public class BigbenchClone{    
    private static void copyRdfFiles(File sourceDir, File destinationDir) throws IOException {
        File[] allRdfFiles = sourceDir.listFiles(new FilenameFilter() {

            
            public boolean accept(File dir, String name) {
                return name.endsWith(".rdf") && !name.endsWith(DELETED_RDF);
            }
        });
        for (File file : allRdfFiles) {
            FileUtils.copyFileToDirectory(file, destinationDir);
        }
    }
}