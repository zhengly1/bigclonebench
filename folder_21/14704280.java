public class BigbenchClone{    
    private String getData(String myurl) throws Exception {
        URL url = new URL(myurl);
        uc = (HttpURLConnection) url.openConnection();
        if (badongoAccount.loginsuccessful) {
            uc.setRequestProperty("Cookie", BadongoAccount.getUsercookie() + ";" + BadongoAccount.getPwdcookie());
        }
        br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String temp = "", k = "";
        while ((temp = br.readLine()) != null) {
            k += temp;
        }
        br.close();
        return k;
    }
}