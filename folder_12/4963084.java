public class BigbenchClone{    
    public Channel<Job> getJobChannel() {
        return getChannel(JOB_CHANNEL_ID);
    }
}