public class BigbenchClone{    
    public void testEmptyBlock_01() throws Exception {
        EXISchema corpus = EXISchemaFactoryTestUtil.getEXISchema("/compression/emptyBlock_01.xsd", getClass(), m_compilerErrors);
        Assert.assertEquals(0, m_compilerErrors.getTotalCount());
        GrammarCache grammarCache = new GrammarCache(corpus, GrammarOptions.STRICT_OPTIONS);
        EXIDecoder decoder = new EXIDecoder();
        Scanner scanner;
        decoder.setAlignmentType(AlignmentType.compress);
        decoder.setBlockSize(1);
        URL url = resolveSystemIdAsURL("/compression/emptyBlock_01.compress");
        int n_events;
        decoder.setEXISchema(grammarCache);
        decoder.setInputStream(url.openStream());
        scanner = decoder.processHeader();
        ArrayList<EXIEvent> exiEventList = new ArrayList<EXIEvent>();
        EXIEvent exiEvent;
        n_events = 0;
        while ((exiEvent = scanner.nextEvent()) != null) {
            ++n_events;
            exiEventList.add(exiEvent);
        }
        Assert.assertEquals(11, n_events);
        Assert.assertEquals(1, ((ChannellingScanner) scanner).getBlockCount());
        EventType eventType;
        EventTypeList eventTypeList;
        int pos = 0;
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_SD, exiEvent.getEventVariety());
        eventType = exiEvent.getEventType();
        Assert.assertSame(exiEvent, eventType);
        Assert.assertEquals(0, eventType.getIndex());
        eventTypeList = eventType.getEventTypeList();
        Assert.assertNull(eventTypeList.getEE());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_SE, exiEvent.getEventVariety());
        Assert.assertEquals("root", exiEvent.getName());
        Assert.assertEquals("", eventType.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_SE, exiEvent.getEventVariety());
        Assert.assertEquals("parent", exiEvent.getName());
        Assert.assertEquals("", eventType.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_SE, exiEvent.getEventVariety());
        Assert.assertEquals("child", exiEvent.getName());
        Assert.assertEquals("", eventType.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_CH, exiEvent.getEventVariety());
        Assert.assertEquals("42", exiEvent.getCharacters().makeString());
        int tp = ((EventTypeSchema) exiEvent.getEventType()).getSchemaSubstance();
        int builtinType = corpus.getBuiltinTypeOfAtomicSimpleType(tp);
        Assert.assertEquals(EXISchemaConst.UNSIGNED_BYTE_TYPE, corpus.getSerialOfType(builtinType));
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_EE, exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_EE, exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_SE, exiEvent.getEventVariety());
        Assert.assertEquals("adjunct", exiEvent.getName());
        Assert.assertEquals("", exiEvent.getURI());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_EE, exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_EE, exiEvent.getEventVariety());
        exiEvent = exiEventList.get(pos++);
        Assert.assertEquals(EXIEvent.EVENT_ED, exiEvent.getEventVariety());
    }
}