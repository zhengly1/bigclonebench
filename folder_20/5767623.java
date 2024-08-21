public class BigbenchClone{    
        
        public void onClick(View v) {
            if (v == b_decrement) {
                getNewValues();
                if (time > min_time) et_time.setText(df.format(time - 0.1)); else et_time.setText(df.format(time));
            } else if (v == b_increment) {
                getNewValues();
                if (time < max_time) et_time.setText(df.format(time + 0.1)); else et_time.setText(df.format(time));
            } else if (v == b_help) {
                showHelpDialog();
            } else if (v == b_aerate) {
                getNewValues();
                new Thread(new Runnable() {

                    public void run() {
                        try {
                            HttpPost httpPostRequest = new HttpPost(Feesh.device_URL);
                            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                            nameValuePairs.add(new BasicNameValuePair("c", "oxygen"));
                            nameValuePairs.add(new BasicNameValuePair("amount", String.valueOf(time)));
                            httpPostRequest.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                            HttpResponse httpResponse = (HttpResponse) new DefaultHttpClient().execute(httpPostRequest);
                            HttpEntity entity = httpResponse.getEntity();
                            String resultString = "";
                            if (entity != null) {
                                InputStream instream = entity.getContent();
                                resultString = convertStreamToString(instream);
                                instream.close();
                            }
                            Message msg_toast = new Message();
                            msg_toast.obj = resultString;
                            toast_handler.sendMessage(msg_toast);
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        } catch (ClientProtocolException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
                showAeratingDialog();
            }
        }
}