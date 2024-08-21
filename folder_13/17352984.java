public class BigbenchClone{
    public void testAudioRecordProperties() throws Exception {
        assertEquals(AudioFormat.ENCODING_PCM_16BIT, mAudioRecord.getAudioFormat());
        assertEquals(MediaRecorder.AudioSource.DEFAULT, mAudioRecord.getAudioSource());
        assertEquals(1, mAudioRecord.getChannelCount());
        assertEquals(AudioFormat.CHANNEL_CONFIGURATION_MONO, mAudioRecord.getChannelConfiguration());
        assertEquals(AudioRecord.STATE_INITIALIZED, mAudioRecord.getState());
        assertEquals(mHz, mAudioRecord.getSampleRate());
        assertEquals(AudioRecord.RECORDSTATE_STOPPED, mAudioRecord.getRecordingState());
        int bufferSize = AudioRecord.getMinBufferSize(mHz, AudioFormat.CHANNEL_CONFIGURATION_DEFAULT, AudioFormat.ENCODING_PCM_16BIT);
        assertTrue(bufferSize > 0);
    }
}