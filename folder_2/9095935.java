public class BigbenchClone{    
	protected void initIoReadWriteMachines(int readwriteThreadNum) throws Exception{
		this.dispatcherManager.init(readwriteThreadNum);
	}
}