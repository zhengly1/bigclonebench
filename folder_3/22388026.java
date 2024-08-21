public class BigbenchClone{    
        private Future<HttpResponse> execute(BoundRequestBuilder builder) {
            try {
                return prepare(builder).execute(new AsyncCompletionHandler<HttpResponse>() {

                    
                    public HttpResponse onCompleted(Response response) throws Exception {
                        return new HttpAsyncResponse(response);
                    }

                    
                    public void onThrowable(Throwable t) {
                        throw new RuntimeException(t);
                    }
                });
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
}