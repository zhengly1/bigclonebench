public class BigbenchClone{    
    public void handle(INonBlockingConnection conn, RemoveElementMessage message) throws IOException {
        Main.broadcast(message, PeterHi.SOCKET, false);
        SocketServer ss = SocketServer.getInstance();
        ClientHandle cs = ss.get(conn);
        RemoveShape rs = new RemoveShape(cs.getChannel(), message.name);
        Persister.getInstance().execute(rs);
    }
}