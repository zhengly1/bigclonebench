public class BigbenchClone{    
    public void updateConfiguration() {
        Configuration.configuration.changeNetworkLimit(writegloballimit, readgloballimit, writesessionlimit, readsessionlimit);
    }
}