public class BigbenchClone{    
    protected AudioFormat getDefaultTargetFormat(AudioFormat targetFormat, AudioFormat sourceFormat) {
        if (TDebug.TraceAudioConverter) {
            TDebug.out("ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): target format: " + targetFormat);
        }
        if (TDebug.TraceAudioConverter) {
            TDebug.out("ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): source format: " + sourceFormat);
        }
        AudioFormat newTargetFormat = null;
        Iterator iterator = getCollectionTargetFormats().iterator();
        while (iterator.hasNext()) {
            AudioFormat format = (AudioFormat) iterator.next();
            if (AudioFormats.matches(targetFormat, format)) {
                newTargetFormat = format;
            }
        }
        if (newTargetFormat == null) {
            throw new IllegalArgumentException("conversion not supported");
        }
        if (TDebug.TraceAudioConverter) {
            TDebug.out("ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): new target format: " + newTargetFormat);
        }
        newTargetFormat = new AudioFormat(targetFormat.getEncoding(), sourceFormat.getSampleRate(), newTargetFormat.getSampleSizeInBits(), newTargetFormat.getChannels(), newTargetFormat.getFrameSize(), sourceFormat.getSampleRate(), newTargetFormat.isBigEndian());
        if (TDebug.TraceAudioConverter) {
            TDebug.out("ImaAdpcmFormatConversionProvider.getDefaultTargetFormat(): really new target format: " + newTargetFormat);
        }
        return newTargetFormat;
    }
}