public class BigbenchClone{    
    public static void reportMem() {
        System.gc();
        System.out.println("freemem:  " + Runtime.getRuntime().freeMemory());
        System.out.println("maxmem:   " + Runtime.getRuntime().maxMemory());
        System.out.println("totalmem: " + Runtime.getRuntime().totalMemory());
        System.out.println("used:     " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        try {
            byte[] b = new byte[5000];
            FileInputStream fin = new FileInputStream("/proc/self/status");
            int readbytes = fin.read(b);
            System.out.write(b, 0, readbytes);
        } catch (IOException ex) {
        }
    }
}