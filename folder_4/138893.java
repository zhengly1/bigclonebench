public class BigbenchClone{    
    public int build(String root, String[] filenames, StringBuffer header, HashMap metadata, ByteArrayOutputStream bytesOut) throws IOException, FileNotFoundException {
        int num_files = 0;
        if (filenames != null) num_files = filenames.length;
        long total_size = 0L;
        for (int i = 0; i < num_files; i++) {
            File f;
            if (root != null) f = new File(root, filenames[i]); else f = new File(filenames[i]);
            if (!f.exists()) throw new FileNotFoundException(filenames[i] + " cannot be found");
            long size = f.length();
            if (size == 0L) System.err.println("File " + filenames[i] + " is empty!");
            FileChannel chan = new RandomAccessFile(f, "r").getChannel();
            size = chan.size();
            ByteBuffer buf = ByteBuffer.allocate((int) size);
            while (buf.hasRemaining()) {
                int read = chan.read(buf);
                if (read == 0) throw new IOException("Read failure: " + f.getPath());
            }
            buf.flip();
            byte data[] = new byte[buf.capacity()];
            buf.get(data, 0, data.length);
            bytesOut.write(data);
            chan.close();
            if (metadata.containsKey(filenames[i])) {
                String md = (String) metadata.get(filenames[i]);
                int md_len = md.length();
                bytesOut.write(md.getBytes("UTF-8"));
                bytesOut.write((byte) (md_len & 0xFF));
                bytesOut.write((byte) ((md_len >> 8) & 0xFF));
                bytesOut.write((byte) ((md_len >> 16) & 0xFF));
                bytesOut.write((byte) ((md_len >> 24) & 0xFF));
                bytesOut.write(METADATA_MAGIC);
                size += md_len + 4 + METADATA_MAGIC_LEN;
            }
            total_size += size;
            header.append(",").append(filenames[i]).append(",").append(size);
        }
        return num_files;
    }
}