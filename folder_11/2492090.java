public class BigbenchClone{    
            public void run() {
                Channel channel = getChannel(channelName);
                dataService.removeObject(channel);
            }
}