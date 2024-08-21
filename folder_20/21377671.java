public class BigbenchClone{    
                    
                    protected IDataWriter chooseDataWriter(Batch batch) {
                        return buildDataWriter(sourceNodeId, batch.getChannelId(), batch.getBatchId());
                    }
}