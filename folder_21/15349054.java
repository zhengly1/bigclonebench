public class BigbenchClone{    
     
    public void testSimpleRead() {
        String nodeId = "055";
        long batchId = 123;
        String channelId = "nbc";
        StringBuilder builder = beginCsv(nodeId);
        beginBatch(builder, batchId, channelId);
        putTableN(builder, 1, true);
        putInsert(builder, 4);
        endCsv(builder);
        CsvDataReader reader = new CsvDataReader(builder);
        DataContext ctx = new DataContext();
        reader.open(ctx);
        Batch batch = reader.nextBatch();
        Assert.assertNotNull(batch);
        Assert.assertEquals(batchId, batch.getBatchId());
        Table table = reader.nextTable();
        Assert.assertNotNull(table);
        Assert.assertEquals("test1", table.getTableName());
        Assert.assertEquals(2, table.getColumnCount());
        Assert.assertEquals(1, table.getPrimaryKeyColumns().size());
        Assert.assertEquals("id", table.getColumn(0).getName());
        Assert.assertEquals("text", table.getColumn(1).getName());
        Data data = reader.nextData();
        Assert.assertNotNull(data);
        Assert.assertEquals(channelId, data.getChannelId());
        Assert.assertEquals(DataEventType.INSERT, data.getEventType());
        Assert.assertEquals("0", data.toParsedRowData()[0]);
        Assert.assertEquals("test", data.toParsedRowData()[1]);
        data = reader.nextData();
        Assert.assertNotNull(data);
        Assert.assertEquals(channelId, data.getChannelId());
        Assert.assertEquals(DataEventType.INSERT, data.getEventType());
        Assert.assertEquals("1", data.toParsedRowData()[0]);
        Assert.assertEquals("test", data.toParsedRowData()[1]);
        data = reader.nextData();
        Assert.assertNotNull(data);
        Assert.assertEquals(channelId, data.getChannelId());
        Assert.assertEquals(DataEventType.INSERT, data.getEventType());
        Assert.assertEquals("2", data.toParsedRowData()[0]);
        Assert.assertEquals("test", data.toParsedRowData()[1]);
        data = reader.nextData();
        Assert.assertNotNull(data);
        Assert.assertEquals(channelId, data.getChannelId());
        Assert.assertEquals(DataEventType.INSERT, data.getEventType());
        Assert.assertEquals("3", data.toParsedRowData()[0]);
        Assert.assertEquals("test", data.toParsedRowData()[1]);
        data = reader.nextData();
        Assert.assertNull(data);
        table = reader.nextTable();
        Assert.assertNull(table);
        batch = reader.nextBatch();
        Assert.assertNull(batch);
        reader.close();
    }
}