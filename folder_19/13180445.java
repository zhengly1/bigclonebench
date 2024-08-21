public class BigbenchClone{    
    public void doBuild() throws JDOMException, IOException, SAXException, ParserConfigurationException, TransformerConfigurationException, TransformerException, JexmaraldaException, URISyntaxException {
        Document comaDocument = new IOUtilities().readDocumentFromResource("/org/exmaralda/common/resources/EmptyComaDocument.coma");
        comaDocument.getRootElement().setAttribute("Name", resultFile.getName().substring(0, resultFile.getName().lastIndexOf(".")));
        IOUtilities.writeDocumentToLocalFile(resultFile.getAbsolutePath(), comaDocument);
        int count = 0;
        for (File folkerFile : folkerFiles) {
            count++;
            double prog = (double) count / (double) (folkerFiles.size() * 2);
            fireCorpusInit(prog, "Converting " + folkerFile.getName());
            String fileNameWithSuffix = folkerFile.getName();
            String fileNameWithoutSuffix = fileNameWithSuffix.substring(0, fileNameWithSuffix.lastIndexOf("."));
            BasicTranscription bt = org.exmaralda.folker.io.EventListTranscriptionXMLReaderWriter.readXMLAsBasicTranscription(folkerFile);
            bt.getBody().stratify(Tier.STRATIFY_BY_DISTRIBUTION);
            String transcriptionName = fileNameWithoutSuffix;
            int number = 2;
            while (communicationsWithExmaraldaFiles.containsKey(transcriptionName)) {
                transcriptionName = fileNameWithoutSuffix + Integer.toString(number);
                number++;
            }
            bt.getHead().getMetaInformation().setTranscriptionName(transcriptionName);
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm:ss z");
            bt.getHead().getMetaInformation().setComment("Imported from " + folkerFile.getAbsolutePath() + " on " + sdf.format(cal.getTime()));
            bt.getHead().getMetaInformation().getUDMetaInformation().setAttribute("FOLKER-Original", folkerFile.getAbsolutePath());
            for (int pos = 0; pos < bt.getBody().getNumberOfTiers(); pos++) {
                Tier tier = bt.getBody().getTierAt(pos);
                if (tier.getSpeaker() == null) {
                    tier.setType("d");
                }
            }
            cGATMinimalSegmentation segmentor = new cGATMinimalSegmentation();
            SegmentedTranscription st = null;
            try {
                st = segmentor.BasicToSegmented(bt);
            } catch (FSMException ex) {
                System.out.println("Segmentation error");
                st = bt.toSegmentedTranscription();
                countSegmentationErrors++;
            }
            File thisDirectoryFile = folkerFile.getParentFile();
            if (separateDirectory) {
                thisDirectoryFile = directoryFile;
            }
            String stName = new File(thisDirectoryFile, transcriptionName + ".exs").getAbsolutePath();
            System.out.println("+++ Writing segmented transcription to " + stName);
            if (this.writeBasic) {
                String btName = new File(thisDirectoryFile, transcriptionName + ".exb").getAbsolutePath();
                System.out.println("+++ Writing basic transcription to " + btName);
                bt.writeXMLToFile(btName, "none");
                st.setEXBSource(btName);
                File[] files = new File[2];
                files[0] = new File(stName);
                files[1] = new File(btName);
                communicationsWithExmaraldaFiles.put(transcriptionName, files);
            } else {
                File[] files = new File[1];
                files[0] = new File(stName);
                communicationsWithExmaraldaFiles.put(transcriptionName, files);
            }
            st.writeXMLToFile(stName, "none");
            communicationsWithFOLKERFiles.put(transcriptionName, folkerFile);
        }
        Vector<Element> allElements = new Vector<Element>();
        for (String name : communicationsWithExmaraldaFiles.keySet()) {
            count++;
            double prog = (double) count / (double) (folkerFiles.size() * 2);
            fireCorpusInit(prog, "Processing " + name);
            File[] files = communicationsWithExmaraldaFiles.get(name);
            File btFile = null;
            if (writeBasic) {
                btFile = files[1];
            } else {
                btFile = File.createTempFile("temp", "exb", directoryFile);
                new SegmentedTranscriptionSaxReader().readFromFile(files[0].getAbsolutePath()).toBasicTranscription().writeXMLToFile(btFile.getAbsolutePath(), "none");
            }
            Vector<Element> elements = BasicTranscription2COMA.generateComaElements(btFile, resultFile);
            Element communicationElement = elements.elementAt(0);
            Element transcriptionElement = communicationElement.getChild("Transcription");
            if (writeBasic) {
                Element otherElement = (Element) (transcriptionElement.clone());
                otherElement.setAttribute("Id", new GUID().makeID());
                otherElement.getChild("Filename").setText(otherElement.getChild("Filename").getText().replace(".exb", ".exs"));
                otherElement.getChild("NSLink").setText(otherElement.getChild("NSLink").getText().replace(".exb", ".exs"));
                otherElement.getChild("Description").getChild("Key").setText("true");
                communicationElement.addContent(otherElement);
            } else {
                transcriptionElement.getChild("Filename").setText(files[0].getName());
                String path = "";
                int index = transcriptionElement.getChild("NSLink").getText().lastIndexOf("/");
                if (index >= 0) {
                    path = transcriptionElement.getChild("NSLink").getText().substring(0, index + 1);
                }
                transcriptionElement.getChild("NSLink").setText(path + files[0].getName());
                transcriptionElement.getChild("Description").getChild("Key").setText("true");
            }
            Element attachedFileElement = new Element("File");
            attachedFileElement.setAttribute("Id", new GUID().makeID());
            File ff = communicationsWithFOLKERFiles.get(communicationElement.getAttributeValue("Name"));
            Element fn = new Element("filename");
            fn.setText(ff.getName());
            attachedFileElement.addContent(fn);
            Element mt = new Element("mimetype");
            mt.setText("application/xml");
            attachedFileElement.addContent(mt);
            Element rp = new Element("relPath");
            System.out.println("=== Relativizing " + ff.toURI() + " relative to " + resultFile.toURI());
            rp.setText((resultFile.getParentFile().toURI().relativize(ff.toURI())).toString());
            attachedFileElement.addContent(rp);
            Element ap = new Element("absPath");
            ap.setText(ff.getAbsolutePath());
            attachedFileElement.addContent(ap);
            communicationElement.addContent(attachedFileElement);
            allElements.add(communicationElement);
            for (int i = 1; i < elements.size(); i++) {
                Element speakerElement = elements.elementAt(i);
                String sigle = speakerElement.getChildText("Sigle");
                String id = speakerElement.getAttributeValue("Id");
                if (speakers.containsKey(sigle)) {
                    Element existingSpeaker = speakers.get(sigle);
                    String hisID = existingSpeaker.getAttributeValue("Id");
                    String xp2 = "//Person[text()='" + id + "']";
                    Element personElement = (Element) XPath.newInstance(xp2).selectSingleNode(communicationElement);
                    personElement.setText(hisID);
                } else {
                    speakers.put(sigle, speakerElement);
                    speakerElement.detach();
                    allElements.add(speakerElement);
                }
            }
            if (!writeBasic) {
                btFile.delete();
            }
        }
        for (Element e : allElements) {
            e.detach();
            comaDocument.getRootElement().getChild("CorpusData").addContent(e);
        }
        IOUtilities.writeDocumentToLocalFile(resultFile.getAbsolutePath(), comaDocument);
    }
}