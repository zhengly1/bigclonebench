public class BigbenchClone{    
    public void updateUser(User user) throws PersistenceException {
        writeMonitorThread.scheduleWriteAction();
    }
}