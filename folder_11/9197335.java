public class BigbenchClone{    
            public void onClick(View v) {
                if (threadCommunication == null) {
                    nameAndColor.add(0, namePlayer);
                    nameAndColor.add(1, GREEN);
                    nameAndColor.add(2, namePlayer);
                    if (!checksStartGame()) {
                        checksStartGame();
                    }
                    showProgressDialogWaitCompleteFeatureGame();
                } else {
                    showProgressDialogWaitCompleteFeatureGame();
                    try {
                        threadCommunication.os.writeUTF("featureClient/" + namePlayer + "/" + GREEN + "/" + adapter.getName());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
}