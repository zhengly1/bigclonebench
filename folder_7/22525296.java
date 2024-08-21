public class BigbenchClone{    
    public TGShareSongResponse getResponse() throws Throwable {
        URL url = new URL(REMOTE_URL);
        URLConnection conn = url.openConnection();
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setRequestProperty("Connection", "Keep-Alive");
        conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + BOUNDARY);
        DataOutputStream out = new DataOutputStream(conn.getOutputStream());
        out.writeBytes(BOUNDARY_SEPARATOR + BOUNDARY + EOL);
        out.writeBytes("Content-Disposition: form-data; name=\"auth\";" + EOL);
        out.writeBytes(EOL);
        out.writeBytes(this.auth.getAuthCode());
        out.writeBytes(EOL);
        out.writeBytes(BOUNDARY_SEPARATOR + BOUNDARY + EOL);
        out.writeBytes("Content-Disposition: form-data; name=\"title\";" + EOL);
        out.writeBytes(EOL);
        out.writeBytes(this.file.getTitle());
        out.writeBytes(EOL);
        out.writeBytes(BOUNDARY_SEPARATOR + BOUNDARY + EOL);
        out.writeBytes("Content-Disposition: form-data; name=\"description\";" + EOL);
        out.writeBytes(EOL);
        out.writeBytes(this.file.getDescription());
        out.writeBytes(EOL);
        out.writeBytes(BOUNDARY_SEPARATOR + BOUNDARY + EOL);
        out.writeBytes("Content-Disposition: form-data; name=\"tagkeys\";" + EOL);
        out.writeBytes(EOL);
        out.writeBytes(this.file.getTagkeys());
        out.writeBytes(EOL);
        out.writeBytes(BOUNDARY_SEPARATOR + BOUNDARY + EOL);
        out.writeBytes("Content-Disposition: form-data; name=\"fileName\";" + " filename=\"" + this.file.getFilename() + "\"" + EOL);
        out.writeBytes(EOL);
        out.write(this.file.getFile());
        out.writeBytes(EOL);
        out.writeBytes(BOUNDARY_SEPARATOR + BOUNDARY + BOUNDARY_SEPARATOR + EOL);
        out.flush();
        out.close();
        return new TGShareSongResponse(conn.getInputStream());
    }
}