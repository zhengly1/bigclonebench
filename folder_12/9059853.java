public class BigbenchClone{    
    public String[][] getChannelScheduleTime() throws Exception {
        return channelScheduleDao.getChannelScheduleTime(strChannelPath);
    }
}