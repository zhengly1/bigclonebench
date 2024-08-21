public class BigbenchClone{    
    public void testTemplatePersistence() throws Exception {
        IProjectManager manager = (IProjectManager) applicationContext.getBean(BEAN_ID_PROJECT_MANAGER);
        assertNotNull(manager);
        StringWriter writer = new StringWriter();
        PrintWriter out = new PrintWriter(writer);
        out.println("# SOME DESCRIPTIVE TITLE.");
        out.println("# Copyright (C) YEAR Free Software Foundation, Inc.");
        out.println("# FIRST AUTHOR <EMAIL@ADDRESS>, YEAR.");
        out.println("#");
        out.println("#, fuzzy");
        out.println("msgid \"\"");
        out.println("msgstr \"\"");
        out.println("\"POT-Creation-Date: 2001-02-09 01:25+0100\\n\"");
        out.println();
        out.println("#: gpl.xml:15");
        out.println("#, no-c-format");
        out.println("#, fuzzy");
        out.println("msgid \"Free Software Foundation, Inc.\"");
        out.println("msgstr \"test2\"");
        Project project = new Project("__test_project__");
        project.setRegisteredDate(new Date(System.currentTimeMillis()));
        project.setName("Test Project");
        project.setVersion("1.0");
        project.setHomepage("homepage");
        project.setDescription("description");
        manager.createProject(project);
        Reader reader = new StringReader(writer.toString());
        long id = manager.addTemplate(project.getId(), "test template", "description", reader);
        flushCurrentSession();
        int count = jdbcTemplate.queryForInt("select count(*) from POTRON_TEMPLATE where template_id=?", new Long[] { id });
        assertEquals(1, count);
        String comment = (String) jdbcTemplate.queryForObject("select comment from POTRON_TEMPLATE where template_id=?", new Long[] { id }, String.class);
        assertNotNull(comment);
        assertTrue(comment.startsWith("# SOME DESCRIPTIVE TITLE."));
        List headers = jdbcTemplate.queryForList("select * from POTRON_TEMPL_HEADER where template_id=?", new Long[] { id });
        assertNotNull(headers);
        assertEquals(1, headers.size());
        Map values = (Map) headers.get(0);
        assertEquals("POT-Creation-Date", values.get("name"));
        assertEquals("2001-02-09 01:25+0100", values.get("value"));
        List entries = jdbcTemplate.queryForList("select * from POTRON_TEMPL_ENTRY where template_id=?", new Long[] { id });
        assertNotNull(entries);
        assertEquals(1, entries.size());
        values = (Map) entries.get(0);
        assertEquals("gpl.xml:15", values.get("entry_refs"));
        assertEquals("#, no-c-format", values.get("comment"));
        assertEquals("Free Software Foundation, Inc.", values.get("entry_name"));
        Template template = manager.getTemplate(id);
        assertNotNull(template);
        assertEquals("test template", template.getName());
        template.setName("test template 2");
        manager.updateTemplate(template.getId(), template.getName(), template.getDescription(), template.getComment());
        flushCurrentSession();
        String name = (String) jdbcTemplate.queryForObject("select name from POTRON_TEMPLATE where template_id=?", new Long[] { id }, String.class);
        assertNotNull(name);
        assertEquals(template.getName(), name);
        getCurrentSession().evict(project);
        project = manager.getProject(project.getId());
        assertTrue(project.getTemplates().contains(template));
        project.getTemplates().remove(template);
        manager.updateProject(project);
        flushCurrentSession();
        count = jdbcTemplate.queryForInt("select count(*) from POTRON_TEMPLATE where template_id=?", new Long[] { id });
        assertEquals(0, count);
    }
}