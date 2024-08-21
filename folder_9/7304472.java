public class BigbenchClone{    
     
    public void copy() {
        DirtyIndicator dirty = new DirtyIndicator();
        Cue cue1 = new Cue(dirty, "number1", "page1", "prompt1", "L 1");
        new CueDetailFactory(24, 12).update(cue1);
        TestingCueListener listener = new TestingCueListener();
        cue1.addListener(listener);
        cue1.setPage("page1");
        cue1.setCurrent(true);
        cue1.setSelected(true);
        LightCueDetail detail1 = (LightCueDetail) cue1.getDetail();
        detail1.getChannelLevel(0).setChannelValue(0.4f);
        detail1.getChannelLevel(0).setSubmasterValue(0.5f);
        detail1.getSubmasterLevel(0).getLevelValue().setValue(0.6f);
        Cue cue2 = cue1.copy();
        assertEquals(cue1, cue2);
        assertEquals(cue1.getPage(), cue2.getPage());
        assertEquals(cue1.getNumber(), cue2.getNumber());
        assertEquals(cue1.getPrompt(), cue2.getPrompt());
        assertEquals(cue1.getDescription(), cue2.getDescription());
        LightCueDetail detail2 = (LightCueDetail) cue2.getDetail();
        assertEquals(detail1.getTiming(), detail2.getTiming());
        assertEquals(detail2.getChannelLevel(0).getChannelLevelValue().getValue(), 0.4f, 0.05f);
        assertEquals(detail2.getChannelLevel(0).getSubmasterValue(), 0.5f, 0.05f);
        assertEquals(detail2.getSubmasterLevel(0).getValue(), 0.6f, 0.05f);
        assertFalse(cue2.isCurrent());
        assertFalse(cue2.isSelected());
        cue1.setPage("page2");
        assertEquals(cue2.getPage(), "page1");
        cue1.setNumber("number2");
        assertEquals(cue2.getNumber(), "number1");
        cue1.setPrompt("prompt2");
        assertEquals(cue2.getPrompt(), "prompt1");
        detail1.getTiming().setFadeInDelay(Time.TIME_2S);
        assertEquals(detail2.getTiming().getFadeInDelay(), Time.TIME_0S);
        detail1.getChannelLevel(0).setChannelValue(0.2f);
        assertEquals(detail2.getChannelLevel(0).getChannelLevelValue().getValue(), 0.4f, 0.05f);
        detail1.getChannelLevel(0).setSubmasterValue(0.3f);
        assertEquals(detail2.getChannelLevel(0).getSubmasterValue(), 0.5f, 0.05f);
        detail1.getSubmasterLevel(0).getLevelValue().setValue(0.4f);
        assertEquals(detail2.getSubmasterLevel(0).getValue(), 0.6f, 0.05f);
        listener.setCurrentChanged(false);
        cue2.setCurrent(true);
        assertFalse(listener.isCurrentChanged());
        dirty.clear();
        assertFalse(cue1.isDirty());
        assertFalse(cue2.isDirty());
        dirty.mark();
        assertTrue(cue1.isDirty());
        assertTrue(cue2.isDirty());
    }
}