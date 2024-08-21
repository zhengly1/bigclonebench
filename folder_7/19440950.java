public class BigbenchClone{    
    public void handle(INonBlockingConnection conn, PolylineMessage message) throws IOException {
        Main.broadcast(message, false);
        SocketServer ss = SocketServer.getInstance();
        ClientHandle cs = ss.get(conn);
        AddShape as = new AddShape(cs.getChannel(), Main.toShape(message));
        Persister.getInstance().execute(as);
    }
}