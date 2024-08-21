public class BigbenchClone{
    public void testSendRequests() throws Throwable {
        final List<ProcessDefinition> ids = new ArrayList<ProcessDefinition>();
        for (Executive e : execs) {
            e.setExecutiveHandler(new ExecutiveHandler(null) {

                
                public void receiveRequest(ProcessDefinition processDefinition) {
                    ids.add(processDefinition);
                }
            });
            e.start();
        }
        ProcessId pid = new ProcessId(dispatcher.getChannel().getLocalAddress(), "id1");
        ProcessDefinition pd = new ProcessDefinition(pid);
        MethodCall method = new MethodCall(JatherHandlerAdapter.RECEIVE_REQUEST, new Object[] { pd });
        RspList list = dispatcher.callRemoteMethods(null, method, GroupRequest.GET_ALL, 0);
        assertEquals("Make sure all execs were called", execs.size(), ids.size());
        for (Rsp r : list.values()) {
            assertTrue("Make sure all calls were received", r.wasReceived());
        }
    }
}