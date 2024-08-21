public class BigbenchClone{    
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String serverUrl = req.getParameter("s");
        String method = req.getParameter("m");
        String query = req.getParameter("q");
        String timeoutValue = req.getParameter("t");
        String regAuthority = req.getParameter("a");
        String regLabel = req.getParameter("l");
        String regType = req.getParameter("c");
        if (log.isTraceEnabled()) {
            log.trace("Received request: " + req.getRequestURL() + "?" + req.getQueryString());
        }
        if (!serverUrl.endsWith("/")) {
            serverUrl = serverUrl + "/";
        }
        int timeout;
        if (timeoutValue != null) {
            timeout = Integer.parseInt(timeoutValue);
        } else {
            timeout = DEFAULT_TIMEOUT;
        }
        final CacheFile cachedFile = new CacheFile(cacheDir, method, query);
        InputStream inputStreamToReturn = null;
        int dasCode = 200;
        CacheWriter cacheWriter = null;
        if (cachingEnabled && cachedFile.getFile().exists()) {
            if (log.isTraceEnabled()) log.trace("File found in cache: " + cachedFile.getFile());
            inputStreamToReturn = new FileInputStream(cachedFile.getFile());
        } else {
            String urlStr = generateUrl(serverUrl, method, query, regAuthority, regLabel, regType);
            URL url = new URL(urlStr);
            if (log.isDebugEnabled()) log.debug("Connecting to URL: " + url);
            URLConnection urlConnection;
            if (proxyHost != null) {
                urlConnection = url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort)));
            } else {
                urlConnection = url.openConnection();
            }
            urlConnection.setConnectTimeout(timeout * 1000);
            urlConnection.setReadTimeout(10 * 1000);
            try {
                urlConnection.connect();
                if ("pdb".equals(method)) {
                    resp.setContentType("text/plain");
                } else {
                    resp.setContentType("text/xml");
                }
                String codeValue = urlConnection.getHeaderField("X-Das-Status");
                if (codeValue != null) {
                    dasCode = Integer.parseInt(codeValue.split(" ")[0]);
                } else {
                    dasCode = 200;
                }
                inputStreamToReturn = urlConnection.getInputStream();
                cacheWriter = new CacheWriter(cachedFile);
            } catch (Exception e) {
                dasCode = 401;
                log.error("Problem opening connection to: " + urlStr + " - " + e.getMessage());
            }
        }
        if (dasCode == 200) {
            writeResponse(resp, cacheWriter, inputStreamToReturn);
        } else {
            failWithMessage(resp, dasCode + " " + dasStatusCodes.get(dasCode));
        }
        if (cachingEnabled && cacheWriter != null) {
            cacheWriter.close();
        }
    }
}