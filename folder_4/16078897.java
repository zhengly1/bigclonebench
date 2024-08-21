public class BigbenchClone{    
    public void testRequestGWInit() {
        RequestGWInit response = new RequestGWInit();
        response.jsrbId = "JSRB2";
        nbuf writebuf = nbuf.mallocNative(4096);
        writebuf.order(ByteOrder.BIG_ENDIAN);
        GatewayReadWriter readWriter = new GatewayReadWriter(0);
        readWriter.writeMessage(writebuf, response);
        writebuf.flip();
        nbuf readbuf = nbuf.mallocNative(4096);
        readbuf.order(ByteOrder.BIG_ENDIAN);
        writebuf.copyTo(0, readbuf, 0, writebuf.remaining());
        readbuf.limit(writebuf.limit());
        CommonHeader header = (CommonHeader) readWriter.readMessage(readbuf);
        readWriter.cleanup();
        assertTrue(header.msgtype == (MSGTYPE_REQUEST | MSGTYPE_GWINIT));
        assertTrue(((RequestGWInit) header).jsrbId.equals(response.jsrbId));
        readbuf.free();
        writebuf.free();
    }
}