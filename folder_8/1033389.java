public class BigbenchClone{    
        FmsChannel getChannel(String jobname) {
            return repo.get(jobname);
        }
}