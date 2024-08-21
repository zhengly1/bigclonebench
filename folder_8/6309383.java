public class BigbenchClone{    
    private void sendResponse(HttpServletResponse response, String responseString, Integer bufferSize) throws Exception {
        OutputStream out = response.getOutputStream();
        responseString = stripNewlinesAndTabs(responseString);
        StringBufferInputStream in = new StringBufferInputStream(responseString);
        response.setContentType("text/xml;charset=utf-8");
        byte[] buffer = new byte[bufferSize];
        int count = 0;
        while ((count = in.read(buffer)) >= 0) out.write(buffer, 0, count);
        out.close();
    }
}