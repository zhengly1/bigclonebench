public class BigbenchClone{    
    public void test_putFields() throws Exception {
        SerializableTestHelper sth;
        try {
            oos.putFields();
            fail("Test 1: NotActiveException expected.");
        } catch (NotActiveException e) {
        }
        oos.writeObject(new SerializableTestHelper("Gabba", "Jabba"));
        oos.flush();
        ois = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
        sth = (SerializableTestHelper) (ois.readObject());
        assertEquals("Test 2: readFields or writeFields failed; first field not set.", "Gabba", sth.getText1());
        assertNull("Test 3: readFields or writeFields failed; second field should not have been set.", sth.getText2());
    }
}