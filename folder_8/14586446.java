public class BigbenchClone{    
    public HttpResponse execute() throws HttpException {
        commit();
        return getResponse();
    }
}