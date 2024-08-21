public class BigbenchClone{    
    public File RawEncode(File Data, ByteBuffer RawKey) throws EncodeFailedException {
        SerpentEngine e = new SerpentEngine();
        CBCBlockCipher c = new CBCBlockCipher(e);
        KeyParameter p = new KeyParameter(ChannelReader.BufToBytes(RawKey));
        c.init(true, p);
        CryptoClientTool tool = new CryptoClientTool(c);
        File outfile = null;
        try {
            ChannelReader reader = new ChannelReader(Data);
            outfile = TmpDir.createNewFile("tmp", "tmp");
            ChannelWriter writer = new ChannelWriter(outfile);
            tool.Process(reader, writer);
            reader.close();
            writer.close();
        } catch (IOException e1) {
            e1.printStackTrace();
            throw new EncodeFailedException(e1.getMessage());
        }
        return outfile;
    }
}