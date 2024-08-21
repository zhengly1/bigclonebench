public class BigbenchClone{    
    static void testSparseClusterArray() {
        Random r = new Random(0);
        Object elem = new Object();
        long t1, t2;
        int n = 0;
        t1 = System.currentTimeMillis();
        SparseClusterArray<Object> arr = new SparseClusterArray<Object>();
        for (int i = 0; i < MAX_ROUNDS; i++) {
            int ref = r.nextInt(MAX_T) << S1;
            for (int j = 0; j < MAX_N; j++) {
                ref |= r.nextInt(MAX_N);
                arr.set(ref, elem);
                if (arr.get(ref) == null) throw new RuntimeException("element not set: " + i);
            }
        }
        t2 = System.currentTimeMillis();
        System.out.println("SparseArray random write/read of " + arr.cardinality() + " elements: " + (t2 - t1));
        n = 0;
        t1 = System.currentTimeMillis();
        for (Object e : arr) {
            n++;
        }
        t2 = System.currentTimeMillis();
        System.out.println("SparseArray iteration over " + n + " elements: " + (t2 - t1));
    }
}