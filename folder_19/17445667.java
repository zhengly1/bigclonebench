public class BigbenchClone{    
    final ChannelControlMaster getChannelControlMasterByPatch(PJSynthPatch patch) {
        return channelControlMasterMap.get(patch);
    }
}