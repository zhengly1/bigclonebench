public class BigbenchClone{    
    
    public String getSnmpConfig() {
        return "<?xml version=\"1.0\"?>\n" + "<snmp-config " + " retry=\"3\" timeout=\"3000\"\n" + " read-community=\"public\"" + " write-community=\"private\"\n" + " port=\"161\"\n" + " version=\"v1\">\n" + "\n" + "   <definition port=\"9161\" version=\"v2c\" " + "       security-name=\"opennmsUser\" \n" + "       auth-passphrase=\"0p3nNMSv3\" \n" + "       privacy-passphrase=\"0p3nNMSv3\" >\n" + "       <specific>" + myLocalHost() + "</specific>\n" + "   </definition>\n" + "\n" + "   <definition version=\"v2c\" port=\"9161\" read-community=\"public\" proxy-host=\"" + myLocalHost() + "\">\n" + "<specific>149.134.45.45</specific>\n" + "<specific>172.16.201.2</specific>\n" + "<specific>172.17.1.230</specific>\n" + "<specific>172.31.1.1</specific>\n" + "<specific>172.31.3.1</specific>\n" + "<specific>172.31.3.9</specific>\n" + "<specific>172.31.3.17</specific>\n" + "<specific>172.31.3.25</specific>\n" + "<specific>172.31.3.33</specific>\n" + "<specific>172.31.3.41</specific>\n" + "<specific>172.31.3.49</specific>\n" + "<specific>172.31.3.57</specific>\n" + "<specific>172.31.3.65</specific>\n" + "<specific>172.31.3.73</specific>\n" + "<specific>172.100.10.1</specific>\n" + "<specific>203.19.73.1</specific>\n" + "<specific>203.220.17.53</specific>\n" + "   </definition>\n" + "</snmp-config>";
    }
}