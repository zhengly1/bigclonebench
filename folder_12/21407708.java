public class BigbenchClone{    
    
    public Object consume(ISink previousSink) {
        if (!hookedUpFaucet) throw new XformationException("Pipeline item has not been set up " + "correctly: faucet has not been set");
        if (faucet instanceof IPipelineItem) ((IPipelineItem) faucet).consume(this);
        if (this instanceof ISinkTemplate) {
            if (!((ISinkTemplate) this).isClone()) {
                return null;
            }
        }
        if (!hookedUpSink) throw new XformationException("Pipeline item has not been set up " + "correctly: sink has not been set");
        reader = (Reader) faucet.getSource(ContentType.CharStream);
        getSource(ContentType.CharStream);
        ExecutorsHelper.getInstance().executeInProc(new Runnable() {

            
            public void run() {
                try {
                    int count;
                    char[] buffer = new char[8 * 1024];
                    logger.trace("Using reader " + reader + " for the transformation pipeline");
                    while ((count = reader.read(buffer)) != -1) {
                        char[] transformation = transformBuffer(buffer, 0, count);
                        if (logger.isTraceEnabled()) logger.trace("Read '" + new String(buffer, 0, count) + "' from " + reader + " writing " + new String(transformation) + " to " + writer);
                        writer.write(transformation, 0, transformation.length);
                    }
                    char[] transformation = transformBuffer(buffer, 0, count);
                    if (logger.isTraceEnabled()) logger.trace("Writing final '" + new String(transformation) + "' to " + writer);
                    writer.write(transformation, 0, transformation.length);
                    writer.close();
                    logger.debug("Executable for the reader pipeline will now exit.");
                } catch (Throwable t) {
                    logger.error("Error during pipeline thread execution.", t);
                }
            }
        });
        return null;
    }
}