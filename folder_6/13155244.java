public class BigbenchClone{    
    public void cleanUP() {
        aFEpv.removeValueListeners();
        aFEpv.getChannel().disconnect();
        aFEpv.removeMonitoredPV(aFEpv);
        fastPV.removeValueListeners();
        fastPV.removeMonitoredPV(fastPV);
        slowPV.removeValueListeners();
        slowPV.removeMonitoredPV(slowPV);
        slowPulseLoss.removeValueListeners();
        slowPulseLoss.removeMonitoredPV(slowPulseLoss);
        highVoltage.removeValueListeners();
        highVoltage.removeMonitoredPV(highVoltage);
        highVoltageCurrent.removeValueListeners();
        highVoltageCurrent.removeMonitoredPV(highVoltageCurrent);
        mpsLimit.removeValueListeners();
        mpsLimit.removeMonitoredPV(mpsLimit);
        mpsStatus.removeValueListeners();
        mpsStatus.removeMonitoredPV(mpsStatus);
    }
}