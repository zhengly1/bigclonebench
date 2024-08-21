public class BigbenchClone{    
        
        void copySecKey(RecordInput input, RecordOutput output) {
            output.writeFast(input.readFast());
        }
}