public class BigbenchClone{    
    public HttpResponse execute(HttpHost target, HttpRequest request, HttpContext context) throws IOException {
        return delegate.execute(target, request, context);
    }
}