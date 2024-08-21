public class BigbenchClone{    
    public java.nio.channels.ReadableByteChannel getChannelReadable() {
        alto.lang.buffer.Abstract iob = this.getCreateBuffer();
        return iob.getChannelReadable();
    }
}