public class BigbenchClone{    
    public void requestPatchDump(int bankNum, int patchNum) {
        YamahaDX7sSysexHelpers.chVoiceMode(this, (byte) (getChannel() + 0x10));
        setPatchNum(patchNum + 32 * bankNum);
        send(sysexRequestDump.toSysexMessage(getChannel() + 0x20));
    }
}