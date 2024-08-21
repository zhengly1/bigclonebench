public class BigbenchClone{    
        public void run() {
            try {
                IOUtils.copy(in, out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}