public class BigbenchClone{    
    public void handle_command(Service who, String user, String replyto, String arguments) {
        SrvChannel temp = ((SrvChannel) who);
        String args[] = arguments.split(" ");
        String tU = args[0].toLowerCase();
        if (args.length == 1) {
            if (temp.getChannels().containsKey(tU)) {
                temp.getChannels().remove(tU);
                Generic.srvPart(who, tU, "Channel Unregistered.");
                Logging.info("SRVCHAN", "Channel " + tU + " unregistered by " + user + ".");
                Generic.curProtocol.outPRVMSG(who, replyto, "Channel removed.");
            } else Generic.curProtocol.outPRVMSG(who, replyto, "Error: No such channel is registered");
        } else Generic.curProtocol.outPRVMSG(who, replyto, "Error: Invalid Arguments. Usage: unregister [username]");
    }
}