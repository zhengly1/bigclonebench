public class BigbenchClone{    
    
    public String getCodecDetails() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><b>Encoding Type: </b>");
        sb.append(getEncodingType().toUpperCase());
        if (!Utilities.isNullOrEmpty(getEncoder())) {
            sb.append("<br><b>Encoder: </b>");
            sb.append(getEncoder());
        }
        sb.append("<br><b>Version: </b>");
        sb.append(getMpegVersion());
        sb.append("<br><b>Layer: </b>");
        sb.append(getMpegLayer());
        sb.append("<br><b>Sampling rate: </b>");
        sb.append(getSampleRate() + " Hz");
        sb.append("<br><b>Bitrate: </b>");
        sb.append(getBitRate() + " Kbps");
        sb.append("<br><b>Channels: </b>");
        sb.append(getChannels());
        sb.append("<br><b>Channels mode: </b>");
        sb.append(getChannelsMode());
        sb.append("<br><b>CRC: </b>");
        sb.append(isProtected());
        sb.append("<br><b>Variable Bitrate: </b>");
        sb.append(isVariableBitRate());
        sb.append("<br><b>Copyrighted: </b>");
        sb.append(isCopyrighted());
        sb.append("<br><b>Private: </b>");
        sb.append(isPrivate());
        sb.append("<br><b>Emphasis: </b>");
        sb.append(getEmphasis());
        if (size != -1) {
            sb.append("<br><b>Size: </b>");
            sb.append(Utilities.byteCountToDisplaySize(size));
        }
        sb.append("</html>");
        return sb.toString();
    }
}