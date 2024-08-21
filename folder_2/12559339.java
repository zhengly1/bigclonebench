public class BigbenchClone{    
    public void ready(Collector collector) throws Exception {
        Entity entity = collector;
        Channel channel = entity.getChannel();
        Cursor cursor = channel.getCursor();
        Header header = entity.getHeader();
        Body body = entity.getBody();
        List<Part> list = body.getParts();
        assertEquals(header.getTarget(), "/index.html");
        assertEquals(header.getMethod(), "POST");
        assertEquals(header.getMajor(), 1);
        assertEquals(header.getMinor(), 0);
        assertEquals(header.getContentType().getPrimary(), "multipart");
        assertEquals(header.getContentType().getSecondary(), "form-data");
        assertEquals(header.getValue("Host"), "some.host.com");
        assertEquals(header.getValues("Accept").size(), 4);
        assertEquals(header.getValues("Accept").get(0), "image/gif");
        assertEquals(header.getValues("Accept").get(1), "image/png");
        assertEquals(header.getValues("Accept").get(2), "image/jpeg");
        assertEquals(header.getValues("Accept").get(3), "*");
        assertEquals(list.size(), 4);
        assertEquals(list.get(0).getContentType().getPrimary(), "text");
        assertEquals(list.get(0).getContentType().getSecondary(), "plain");
        assertEquals(list.get(0).getHeader("Content-Disposition"), "file; name=\"pics\"; filename=\"file1.txt\"; modification-date=\"Wed, 12 Feb 1997 16:29:51 -0500\"");
        assertEquals(list.get(0).getName(), "pics");
        assertEquals(list.get(0).getFileName(), "file1.txt");
        assertEquals(list.get(0).isFile(), true);
        assertEquals(list.get(1).getContentType().getPrimary(), "text");
        assertEquals(list.get(1).getContentType().getSecondary(), "plain");
        assertEquals(list.get(1).getHeader("Content-Disposition"), "file; name=\"pics\"; filename=\"file2.txt\"");
        assertEquals(list.get(1).getContentType().getPrimary(), "text");
        assertEquals(list.get(1).getName(), "pics");
        assertEquals(list.get(1).getFileName(), "file2.txt");
        assertEquals(list.get(1).isFile(), true);
        assertEquals(list.get(2).getContentType().getSecondary(), "plain");
        assertEquals(list.get(2).getHeader("Content-Disposition"), "file; name=\"pics\"; filename=\"file3.txt\"");
        assertEquals(list.get(2).getName(), "pics");
        assertEquals(list.get(2).getFileName(), "file3.txt");
        assertEquals(list.get(2).isFile(), true);
        assertEquals(list.get(3).getContentType().getPrimary(), "text");
        assertEquals(list.get(3).getContentType().getSecondary(), "plain");
        assertEquals(list.get(3).getHeader("Content-Disposition"), "file; name=\"pics\"; filename=\"file4.txt\"");
        assertEquals(list.get(3).getName(), "pics");
        assertEquals(list.get(3).getFileName(), "file4.txt");
        assertEquals(list.get(3).isFile(), true);
        assertEquals(cursor.ready(), 0);
    }
}