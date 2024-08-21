public class BigbenchClone{    
    public TestReport runImpl() throws Exception {
        String parser = XMLResourceDescriptor.getXMLParserClassName();
        SAXSVGDocumentFactory df = new SAXSVGDocumentFactory(parser);
        File f = (new File(testFileName));
        URL url = f.toURL();
        Document doc = df.createDocument(url.toString(), url.openStream());
        Element e = doc.getElementById(targetId);
        if (e == null) {
            DefaultTestReport report = new DefaultTestReport(this);
            report.setErrorCode("error.get.element.by.id.failed");
            report.addDescriptionEntry("entry.key.id", targetId);
            report.setPassed(false);
            return report;
        }
        DOMImplementation di = SVGDOMImplementation.getDOMImplementation();
        Document d = di.createDocument(SVGDOMImplementation.SVG_NAMESPACE_URI, "svg", null);
        Element celt = (Element) d.importNode(e, true);
        NamedNodeMap attrs = e.getAttributes();
        for (int i = 0; i < attrs.getLength(); i++) {
            Node attr = attrs.item(i);
            String ns = attr.getNamespaceURI();
            String name = (ns == null) ? attr.getNodeName() : attr.getLocalName();
            String val = attr.getNodeValue();
            String val2 = celt.getAttributeNS(ns, name);
            if (!val.equals(val2)) {
                DefaultTestReport report = new DefaultTestReport(this);
                report.setErrorCode("error.attr.comparison.failed");
                report.addDescriptionEntry("entry.attr.name", name);
                report.addDescriptionEntry("entry.attr.value1", val);
                report.addDescriptionEntry("entry.attr.value2", val2);
                report.setPassed(false);
                return report;
            }
        }
        return reportSuccess();
    }
}