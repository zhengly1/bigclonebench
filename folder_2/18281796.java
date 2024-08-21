public class BigbenchClone{    
    
    public String dumpPipeline() {
        return sink.get().dumpPipeline() + "\n" + getClass().getName() + ": " + reader + "->" + writer + "->" + readerForFaucet;
    }
}