public class BigbenchClone{    
    protected HttpResponse executeSocialRequest(HttpRequest request) throws GadgetException {
        return requestPipeline.execute(request);
    }
}