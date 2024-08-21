public class BigbenchClone{    
        public boolean onData(INonBlockingConnection connection) throws IOException, BufferUnderflowException {
            if (!Thread.currentThread().getName().startsWith(MyThreadFactory.PREFIX)) {
                errors.add("[onData] should be executed by a worker thread not by " + Thread.currentThread().getName());
            }
            if (!isInitialized) {
                errors.add("[onData]  should be initialized");
            }
            if (isDestroyed) {
                errors.add("[onData]  shouldn't be isDestroyed");
            }
            State state = (State) connection.attachment();
            if (state == null) {
                errors.add("[onData] connection doesn't contains state attachment (state should be connected)");
            } else {
                if (state != State.CONNECTED) {
                    errors.add("[on data] connection should be in state connected. current state is " + state);
                }
            }
            connection.write(connection.readByteBufferByDelimiter(DELIMITER, Integer.MAX_VALUE));
            connection.write(DELIMITER);
            connection.flush();
            return true;
        }
}