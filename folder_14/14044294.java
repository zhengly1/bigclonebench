public class BigbenchClone{    
     
    public void testDiscardReadBytes() {
        ChannelBuffer a, b;
        a = wrappedBuffer(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        b = wrappedCheckedBuffer(wrappedBuffer(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0, 5), wrappedBuffer(new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5, 5));
        a.skipBytes(6);
        a.markReaderIndex();
        b.skipBytes(6);
        b.markReaderIndex();
        assertEquals(a.readerIndex(), b.readerIndex());
        a.readerIndex(a.readerIndex() - 1);
        b.readerIndex(b.readerIndex() - 1);
        assertEquals(a.readerIndex(), b.readerIndex());
        a.writerIndex(a.writerIndex() - 1);
        a.markWriterIndex();
        b.writerIndex(b.writerIndex() - 1);
        b.markWriterIndex();
        assertEquals(a.writerIndex(), b.writerIndex());
        a.writerIndex(a.writerIndex() + 1);
        b.writerIndex(b.writerIndex() + 1);
        assertEquals(a.writerIndex(), b.writerIndex());
        assertTrue(ChannelBuffers.equals(a, b));
        a.discardReadBytes();
        b.discardReadBytes();
        assertEquals(a.readerIndex(), b.readerIndex());
        assertEquals(a.writerIndex(), b.writerIndex());
        assertTrue(ChannelBuffers.equals(a, b));
        a.resetReaderIndex();
        b.resetReaderIndex();
        assertEquals(a.readerIndex(), b.readerIndex());
        a.resetWriterIndex();
        b.resetWriterIndex();
        assertEquals(a.writerIndex(), b.writerIndex());
        assertTrue(ChannelBuffers.equals(a, b));
        buffer.writerIndex(0);
        for (int i = 0; i < buffer.capacity(); i += 4) {
            buffer.writeInt(i);
        }
        ChannelBuffer copy = copiedBuffer(buffer);
        buffer.readerIndex(CAPACITY2 / 4);
        buffer.markReaderIndex();
        buffer.writerIndex(CAPACITY2 / 3);
        buffer.markWriterIndex();
        buffer.readerIndex(0);
        buffer.writerIndex(CAPACITY2 / 2);
        buffer.discardReadBytes();
        assertEquals(0, buffer.readerIndex());
        assertEquals(CAPACITY2 / 2, buffer.writerIndex());
        assertEquals(copy.slice(0, CAPACITY2 / 2), buffer.slice(0, CAPACITY2 / 2));
        buffer.resetReaderIndex();
        assertEquals(CAPACITY2 / 4, buffer.readerIndex());
        buffer.resetWriterIndex();
        assertEquals(CAPACITY2 / 3, buffer.writerIndex());
        buffer.readerIndex(1);
        buffer.writerIndex(CAPACITY2 / 2);
        buffer.discardReadBytes();
        assertEquals(0, buffer.readerIndex());
        assertEquals(CAPACITY2 / 2 - 1, buffer.writerIndex());
        assertEquals(copy.slice(1, CAPACITY2 / 2 - 1), buffer.slice(0, CAPACITY2 / 2 - 1));
        assertEquals(copy.slice(CAPACITY2 / 2, CAPACITY2 / 2), buffer.slice(CAPACITY2 / 2 - 1, CAPACITY2 / 2));
        buffer.resetReaderIndex();
        assertEquals(CAPACITY2 / 4 - 1, buffer.readerIndex());
        buffer.resetWriterIndex();
        assertEquals(CAPACITY2 / 3 - 1, buffer.writerIndex());
        buffer.readerIndex(0);
        int len = CAPACITY2 - 1;
        buffer.writerIndex(len);
        int read = CAPACITY2 / 2 - 1;
        buffer.skipBytes(read);
        buffer.discardReadBytes();
        assertEquals(0, buffer.readerIndex());
        assertEquals(len - read, buffer.writerIndex());
        assertEquals(copy.slice(read + 1, len - read), buffer.slice(0, len - read));
        assertEquals(copy.slice(read + 1 + 100, len - read - 100), buffer.slice(100, len - read - 100));
    }
}