public class BigbenchClone{    
    protected static void writeSafeEquals(String className, SymbolData sd, int baseIndent, String valueEqualsName, MethodData[] accessors) {
        String listName = sd.createUniqueName("__equalsList");
        VariableData equalsList = new VariableData(listName, new ModifiersAndVisibility(SourceInfo.NONE, new String[] { "private", "static" }), _llv.getQualifiedSymbolData("java.util.LinkedList", SourceInfo.NONE, false), true, sd);
        equalsList.setGenerated(true);
        sd.addVar(equalsList);
        _writeToFileOut(newLine + indentString(baseIndent, 1) + "/** This field is automatically generated by the Language Level Converter. */");
        if (LanguageLevelConverter.OPT.javaVersion().supports(JavaVersion.JAVA_5)) _writeToFileOut(newLine + indentString(baseIndent, 1) + "private java.util.LinkedList<" + className + "> " + listName + " = new java.util.LinkedList<" + className + ">();" + newLine); else _writeToFileOut(newLine + indentString(baseIndent, 1) + "private java.util.LinkedList " + listName + " = new java.util.LinkedList();" + newLine + newLine);
        _writeToFileOut(newLine + indentString(baseIndent, 1) + "/** This method is automatically generated by the Language Level Converter. */" + newLine);
        _writeToFileOut(indentString(baseIndent, 1) + "public boolean equals(java.lang.Object o) {" + newLine);
        _writeToFileOut(indentString(baseIndent, 2) + "if (this == o) {" + newLine);
        _writeToFileOut(indentString(baseIndent, 3) + "return true;" + newLine);
        _writeToFileOut(indentString(baseIndent, 2) + "}" + newLine);
        _writeToFileOut(indentString(baseIndent, 2) + "else if ((o == null) || (! o.getClass().equals(getClass()))) {" + newLine);
        _writeToFileOut(indentString(baseIndent, 3) + "return false;" + newLine);
        _writeToFileOut(indentString(baseIndent, 2) + "}" + newLine);
        _writeToFileOut(indentString(baseIndent, 2) + "else {" + newLine);
        _writeToFileOut(indentString(baseIndent, 3) + "boolean alreadyTested = false;" + newLine);
        if (LanguageLevelConverter.OPT.javaVersion().supports(JavaVersion.JAVA_5)) {
            _writeToFileOut(indentString(baseIndent, 3) + "for (" + className + " element : " + listName + ")" + newLine);
            _writeToFileOut(indentString(baseIndent, 4) + "alreadyTested = alreadyTested || (o == element);" + newLine + newLine);
        } else {
            if (LanguageLevelConverter.OPT.javaVersion().supports(JavaVersion.JAVA_5)) {
                _writeToFileOut(indentString(baseIndent, 3) + "java.util.Iterator<" + className + "> i = " + listName + ".iterator();" + newLine);
            } else {
                _writeToFileOut(indentString(baseIndent, 3) + "java.util.Iterator i = " + listName + ".iterator();" + newLine);
            }
            _writeToFileOut(indentString(baseIndent, 3) + "while (!alreadyTested && i.hasNext())" + newLine);
            _writeToFileOut(indentString(baseIndent, 4) + "alreadyTested = alreadyTested || (o == i.next());" + newLine + newLine);
        }
        _writeToFileOut(indentString(baseIndent, 3) + "if (alreadyTested) { " + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + "return true;" + newLine);
        _writeToFileOut(indentString(baseIndent, 3) + "}" + newLine);
        _writeToFileOut(indentString(baseIndent, 3) + "else {" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + className + " cast = ((" + className + ") o);" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + listName + ".addLast(cast);" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + "boolean result;" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + "try {" + newLine);
        _writeToFileOut(indentString(baseIndent, 5) + "result = ");
        int variablesCompared = 0;
        for (int i = 0; i < accessors.length; i++) {
            if (variablesCompared > 0) {
                _writeToFileOut(" && " + newLine + indentString(baseIndent, 7));
            }
            variablesCompared++;
            String varName = accessors[i].getName() + "()";
            if (LanguageLevelConverter.OPT.javaVersion().supports(JavaVersion.JAVA_5) || !accessors[i].getReturnType().getSymbolData().isPrimitiveType()) {
                _writeToFileOut(valueEqualsName + "(" + varName + ", cast." + varName + ")");
            } else {
                _writeToFileOut("(" + varName + " == cast." + varName + ")");
            }
        }
        if (variablesCompared == 0) _writeToFileOut("true");
        _writeToFileOut(";" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + "}" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + "catch (RuntimeException e) {" + newLine);
        _writeToFileOut(indentString(baseIndent, 5) + listName + ".removeLast();" + newLine);
        _writeToFileOut(indentString(baseIndent, 5) + "throw e;" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + "}" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + listName + ".removeLast();" + newLine);
        _writeToFileOut(indentString(baseIndent, 4) + "return result;" + newLine);
        _writeToFileOut(indentString(baseIndent, 3) + "}" + newLine);
        _writeToFileOut(indentString(baseIndent, 2) + "}" + newLine);
        _writeToFileOut(indentString(baseIndent, 1) + "}" + newLine);
    }
}