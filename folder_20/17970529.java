public class BigbenchClone{    
    public HttpResponse execute(HttpUriRequest request) throws IOException {
        return delegate.execute(request);
    }
}