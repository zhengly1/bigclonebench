public class BigbenchClone{    
    private static MQQueueManager getMQQueueManager(MqQueueManager qm) throws MQException {
        if (!qm.getHostName().toLowerCase().equals("localhost")) {
            MQEnvironment.hostname = qm.getHostName();
        }
        MQEnvironment.channel = qm.getChannel();
        MQEnvironment.port = qm.getPort();
        return new MQQueueManager(qm.getQManager());
    }
}