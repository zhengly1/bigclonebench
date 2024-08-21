public class BigbenchClone{    
    private static final void makeWF_JavaComponent_jwf(Hashtable pWriterFormats) {
        pWriterFormats.put("JavaComponent.jwf", "!<header>\n\n\n\n$<{java.CodeWriter.package>package $<java.CodeWriter.package>;$<}java.CodeWriter.package>\n\n\n\nimport java.io.FileOutputStream;\nimport java.io.File;\nimport java.io.FileReader;\nimport java.io.PrintWriter;\nimport java.io.StringWriter;\nimport java.io.StringReader;\nimport java.io.BufferedReader;\nimport java.io.FileWriter;\nimport java.io.BufferedWriter;\n\nimport java.util.Vector;\nimport java.util.Hashtable;\nimport java.util.Calendar;\n\n\n\n!<{import>/* section:import << */\n//\n\n!<import>\n\n//\n/* section:import >> */!<}import>\n\n\n\npublic class $<main.CodeWriter> \n$<{java.CodeWriter.extends>  extends $<java.CodeWriter.extends> $<}java.CodeWriter.extends> \n$<{java.CodeWriter.implements>  implements $<java.CodeWriter.implements> $<}java.CodeWriter.implements>\n{\n\n  /* Constants << */\n \n  // User Interface text message parts\n  public static final String writer__UITEXT_Method                   = \"method \";\n  public static final String writer__UITEXT_Main                     = \"main \";\n  public static final String writer__UITEXT_ExceptionIn              = \"Exception in \";\n  public static final String writer__UITEXT_ColonNewLine             = \":\\n\";\n  public static final String writer__UITEXT_NewLine                  = \"\\n\";\n  public static final String writer__UITEXT_Section                  = \"section \";\n  public static final String writer__UITEXT_SavedFile                = \"Saved file:       \";\n  public static final String writer__UITEXT_UnableToSaveFile         = \"Unable to save file: \";\n  public static final String writer__UITEXT_UnableToBackupFile       = \"Unable to backup file: \";\n  public static final String writer__UITEXT_ToBackupFolder           = \" to backup folder: \";\n  public static final String writer__UITEXT_BackupFolderColon        = \"Backup folder: \";\n  public static final String writer__UITEXT_BackupFolderExistFailure = \" does not exist and cannot be created.\";\n  public static final String writer__UITEXT_BackupFolderNotAFolder   = \" is not a folder.\";\n  public static final String writer__UITEXT_BackupFolderNotWritable  = \" is not writable.\";\n  public static final String writer__UITEXT_CodeWriterState          = \"Code Writer State: \";\n  public static final String writer__UITEXT_GetFileIndexEquals       = \"\\n_getFileIndex()    = \";\n  public static final String writer__UITEXT_GetFullFileNameEquals    = \"\\n_getFullFileName() = \";\n  public static final String writer__UITEXT_GetOutputFolderEquals    = \"\\n_getOutputFolder() = \";\n  public static final String writer__UITEXT_ErrorHeader              = \"\\n\\n--- CodeWriter Error Description Start ---\\n\\n\";\n  public static final String writer__UITEXT_ErrorFooter              = \"\\n--- CodeWriter Error Description End -----\\n\\n\";\n  public static final String writer__UITEXT_PlaceHolderException \n    = \"This placeholder Exception should never be thrown: there is an error in the WriterFormat.\";\n\n  public static final int writer__FILE_BUFFER_SIZE  = 4096;                // initial size of StringBuffer\n\n  /* Constants >> */\n\n\n  /* Writer Variables << */\n\n  protected String[]     writer__iFileNameRoots     = new String[] {};     // generated file name roots\n  protected int          writer__iNumFiles          = 0;                   // number of generated files\n  \n  protected String       writer__iFileNamePrefix    = \"\";                  // failsafe default\n  protected String       writer__iFileNameSuffix    = \"\";                  // failsafe default\n\n  protected String       writer__iBackupPrefix      = \"\";                  // failsafe default\n  protected String       writer__iBackupSuffix      = \"\";                  // failsafe default\n\n  protected StringBuffer writer__iCurrentText       = new StringBuffer();  // current text\n  protected int          writer__iCurrentFileIndex  = 0;                   // current file index\n\n  protected boolean      writer__iSave              = true;                // save generated code to disk\n  protected boolean      writer__iBackup            = true;                // make backups\n\n  protected String       writer__iOutputFolder      = \".\";                 // written code is output to this folder\n  protected String       writer__iBackupFolder      = \".\";                 // overwritten files are placed here\n\n  protected Hashtable    writer__iProperties            = new Hashtable(); // lookup table for compile time properties\n  protected boolean      writer__iPropertiesInitialised = false;           // true => lookup table initialiased\n\n  /* Writer Variables >> */\n\n\n  !<{declare>/* section:declare << */\n  //\n\n  !<declare>\n\n  //\n  /* section:declare >> */!<}declare>\n\n\n\n  /* Writer Services << */\n\n  /* Initialize. */\n  public void writer__initialize() {\n    writer__iCurrentFileIndex = 0;\n    writer__setDefaults();\n  }\n\n\n\n  /** Main loop.\n   *  Template script is placed here in the @body section.\n   */\n  public void writer__write() throws Exception {\n\n    // initialize\n    String writer__currentSection = \"init\";\n\n    try {\n      !<{init>/* section:init << */\n      //\n\n      !<init>\n\n      //\n      /* section:init >> */!<}init>\n\n\n      // write files loop\n      int      writer__numFiles = _getNumFiles();\n      int      writer__fileI    = 0;\n      writer__next_file: for( writer__fileI = 0; writer__fileI < writer__numFiles; writer__fileI++ ) {\n\n        !<{prewrite>/* section:prewrite << */\n        // \n\n        writer__currentSection = \"prewrite\";\n        !<prewrite>\n\n        //\n        /* section:prewrite >> */!<}prewrite>\n\n\n        if( ! writer__startFile() ) { continue writer__next_file; }\n\n\n        !<{body>/* section:body << */\n        //\n\n        writer__currentSection = \"body\";\n        !<body>\n\n        //\n        /* section:body >> */!<}body>\n\n\n        if( ! writer__endFile() ) { continue writer__next_file; }\n\n\n        !<{postwrite>/* section:postwrite << */\n        // \n\n        writer__currentSection = \"postwrite\";\n        !<postwrite>\n\n        //\n        /* section:postwrite >> */!<}postwrite>\n\n        writer__nextFile();       \n      }\n \n\n      !<{cleanup>/* section:cleanup << */\n      //\n \n      writer__currentSection = \"cleanup\";\n      !<cleanup>\n\n      //\n      /* section:cleanup >> */!<}cleanup>\n\n\n    } \n    catch( Exception e ) {\n      writer__handleException( writer__UITEXT_ExceptionIn + writer__UITEXT_Section + writer__currentSection, e );\n    }\n\n  }\n\n\n\n  /** Start writing a file. */\n  public boolean writer__startFile() {\n    writer__iCurrentText = new StringBuffer( writer__FILE_BUFFER_SIZE );\n    return true;\n  }\n\n\n\n  /** End writing a file. */\n  public boolean writer__endFile() throws Exception {\n    boolean endOK = true;\n\n    String fileName = _getFullFileName();\n    String filePath \n      = writer__iOutputFolder\n      + \"$<\\jostraca.system.fileSeparator>\"\n      + fileName\n      ;\n\n    if( writer__iBackup ) {\n      try {\n        writer__backup( filePath, fileName, writer__iBackupFolder );\n\n      } \n      catch( Exception e ) {\n        writer__handleException( writer__UITEXT_UnableToBackupFile \n                                + filePath \n                                + writer__UITEXT_ToBackupFolder\n                                + writer__iBackupFolder\n                                ,e \n                              );\n        endOK = false;\n      }\n    }\n \n    if( endOK && writer__iSave ) {\n      try {\n        writer__save( filePath, writer__iCurrentText.toString() );\n      } \n      catch( Exception e ) {\n        writer__handleException( writer__UITEXT_UnableToSaveFile + filePath, e );\n        endOK = false;\n      }\n    }\n\n    return endOK;\n  }\n\n\n\n  /** Move to next file. */\n  public void writer__nextFile() {\n    writer__iCurrentFileIndex = writer__iCurrentFileIndex + 1;\n  }\n\n\n\n  /** Set defaults from configuration property set. */\n  public void writer__setDefaults() {\n\n    $<{main.FileNameRoot>_setFileNameRoot( \"$<\\main.FileNameRoot>\" );$<}main.FileNameRoot>\n    $<{main.FileNamePrefix>_setFileNamePrefix( \"$<\\main.FileNamePrefix>\" );$<}main.FileNamePrefix>\n    $<{main.FileNameSuffix>_setFileNameSuffix( \"$<\\main.FileNameSuffix>\" );$<}main.FileNameSufffix>\n\n    $<{main.OutputFolder>_setOutputFolder( \"$<\\main.OutputFolder>\" );$<}main.OutputFolder>\n\n    $<{main.BackupFolder>_setBackupFolder( \"$<\\main.BackupFolder>\" );$<}main.BackupFolder>\n    $<{main.BackupPrefix>_setBackupPrefix( \"$<\\main.BackupPrefix>\" );$<}main.BackupPrefix>\n    $<{main.BackupSuffix>_setBackupSuffix( \"$<\\main.BackupSuffix>\" );$<}main.BackupSufffix>\n    _backup( \"$<lang.TrueString>\".equals( \"$<jostraca.MakeBackup>\" ) );\n\n  }\n\n\n\n  /** Handle exceptions: print an explanation for user. */\n  public void writer__handleException( String rMessage, Exception rException ) throws Exception {\n\n    StringBuffer userMsg = new StringBuffer( 111 );\n\n    userMsg.append( writer__UITEXT_ErrorHeader );\n\n    userMsg.append( writer__describeState() + rMessage + writer__UITEXT_ColonNewLine );\n\n    StringWriter stringWriter = new StringWriter();\n    rException.printStackTrace( new PrintWriter( stringWriter) );\n    userMsg.append( stringWriter.toString() );\n\n    userMsg.append( writer__UITEXT_ErrorFooter );\n\n    throw new Exception( userMsg.toString() );\n  }\n\n\n\n  /** Provide a concise description of the state of the CodeWriter. */\n  public String writer__describeState() {\n    String currentState \n      = writer__UITEXT_CodeWriterState\n      + writer__UITEXT_GetFileIndexEquals    + _getFileIndex() \n      + writer__UITEXT_GetFullFileNameEquals + _getFullFileName()\n      + writer__UITEXT_GetOutputFolderEquals + _getOutputFolder()\n      + writer__UITEXT_NewLine\n      ; \n    return currentState;\n  }\n\n\n\n  /** Save written files to disk. \n   *  @param rFilePath Save location.\n   *  @param rContent  File content.\n   */\n  public void writer__save( String rFilePath, String rContent ) throws Exception {\n    StringReader   sr = new StringReader( rContent );\n    BufferedReader br = new BufferedReader( sr );\n    FileWriter     fw = new FileWriter( rFilePath );\n    BufferedWriter bw = new BufferedWriter( fw );\n\n    String line;\n    while( null != (line = br.readLine()) ) {\n      bw.write( line );\n      bw.newLine();\n    }\n\n    bw.close();\n    br.close();\n\n  }\n\n\n\n  /** Read file from disk.\n   *  @param rFilePath.\n   */\n  public String writer__read( String rFilePath ) throws Exception {\n    File       file       = new File( rFilePath );\n    FileReader in         = new FileReader( file );\n    int        size       = (int) file.length();\n    char[]     data       = new char[size];\n    int        charsRead  = 0;\n\n    while( charsRead < size ) {\n      charsRead += in.read( data, charsRead, size - charsRead );\n    }\n\n    return new String( data );\n  }\n\n\n\n  /** Backup overwritten files, if they exist.\n   *  Backups have the format:\n   *  [YYYYMMDDhhmmss][prefix][filename][suffix]\n   *  @param rFilePath     Full Path of File to backup (including name).\n   *  @param rFileName     Name of File to backup.\n   *  @param rBackupFolder Folder to place backups in.\n   */ \n  public void writer__backup( String rFilePath, String rFileName, String rBackupFolder ) throws Exception {\n\n    File backupFolder = new File( rBackupFolder );\n\n    // check backup folder ( create if necessary )\n    // ...\n\n    if( ! backupFolder.exists() ) {\n      if( ! backupFolder.mkdir() ) {\n        throw new Exception( writer__UITEXT_BackupFolderColon\n                             + backupFolder\n                             + writer__UITEXT_BackupFolderExistFailure );\n      }\n    }\n    if( ! backupFolder.isDirectory() ) {\n      throw new Exception( writer__UITEXT_BackupFolderColon \n                           + backupFolder\n                           + writer__UITEXT_BackupFolderNotAFolder );\n    }\n    if( ! backupFolder.canWrite() ) {\n      throw new Exception( writer__UITEXT_BackupFolderColon\n                           + backupFolder\n                           + writer__UITEXT_BackupFolderNotWritable );\n    }\n\n    // create backup file path\n    Calendar calendar = Calendar.getInstance();\n    String year_yyyy = _align( String.valueOf( calendar.get(Calendar.YEAR) ),         \"0\", 4, 'r' );\n    String month_mm  = _align( String.valueOf( (1+calendar.get(Calendar.MONTH)) ),    \"0\", 2, 'r' );\n    String day_dd    = _align( String.valueOf( calendar.get(Calendar.DAY_OF_MONTH) ), \"0\", 2, 'r' );\n    String hour_hh   = _align( String.valueOf( calendar.get(Calendar.HOUR_OF_DAY) ),  \"0\", 2, 'r' );\n    String minute_mm = _align( String.valueOf( calendar.get(Calendar.MINUTE) ),       \"0\", 2, 'r' );\n    String second_ss = _align( String.valueOf( calendar.get(Calendar.SECOND) ),       \"0\", 2, 'r' );\n    String dateTime       = year_yyyy+month_mm+day_dd+hour_hh+minute_mm+second_ss;\n    String backupFileName = dateTime + writer__iBackupPrefix + rFileName + writer__iBackupSuffix;\n    File   backupFilePath = new File( rBackupFolder, backupFileName );\n    \n    // save backup file\n    File fileToBackup = new File( rFilePath );\n    if( fileToBackup.exists() ) {\n      String fileContents = writer__read( rFilePath );\n      writer__save( backupFilePath.getPath(), fileContents );\n    }\n  }\n\n\n\n  /** Set compile time properties. */\n  public void writer__initProperties() {\n    $<{jostraca.properties.NameValueList>\n    String[] propertyList = new String[] { $<jostraca.properties.NameValueList> };\n    int numProperties = propertyList.length;\n    for( int propI = 0; propI < numProperties; propI += 2 ) {\n      writer__iProperties.put( propertyList[ propI ], propertyList[ propI+1 ] );\n    }\n    writer__iPropertiesInitialised = true;\n    $<}jostraca.properties.NameValueList>\n  }\n\n\n  /* Writer Services >> */\n \n\n\n\n  /* Template Services (File Generation) << */\n\n  /** Set the prefix of the files to be written. \n   *  @param rPrefix Written files prefix.\n   */\n  public void _setFileNamePrefix( String rPrefix ) {\n    if( null == rPrefix ) {\n      return; // ignore\n    }\n    writer__iFileNamePrefix = rPrefix;\n  }\n\n\n\n  /** Get prefix of files to be written. */\n  public String _getFileNamePrefix() {\n    return writer__iFileNamePrefix;\n  }\n\n\n\n  /** Set the suffix of the files to be written. \n   *  @param rSuffix Written files suffix.\n   */\n  public void _setFileNameSuffix( String rSuffix ) {\n    if( null == rSuffix ) {\n      return; // ignore\n    }\n    writer__iFileNameSuffix = rSuffix;\n  }\n\n\n\n  /** Get suffix of files to be written. */\n  public String _getFileNameSuffix() {\n    return writer__iFileNameSuffix;\n  }\n\n\n\n  /** Set the full name of the file to be written. \n   *  Prefix and Suffix are set to empty\n   *  @param rName Full name of the file to write.\n   */\n  public void _setFullFileName( String rName ) {\n    _setFileNamePrefix( \"\" );\n    _setFileNameRoot(   rName );\n    _setFileNameSuffix( \"\" );\n  }\n\n\n\n  /** Get the full name of current file being generated. */\n  public String _getFullFileName() {\n    return _getFileNamePrefix() + _getFileNameRoot() + _getFileNameSuffix();\n  }\n\n\n\n  /** Set the names of the files to be written. \n   *  Prefix and Suffix are set to empty\n   *  @param rName Full name of the file to write.\n   */\n  public void _setFullFileNames( String[] rNames ) {\n    _setFileNamePrefix( \"\" );\n    _setFileNameRoots(  rNames );\n    _setFileNameSuffix( \"\" );\n  }\n\n\n\n  /** Get the full names of the files to be written. */\n  public String[] _getFullFileNames() {\n\n    String[] fileNameRoots  = _getFileNameRoots();\n    int      numFiles       = fileNameRoots.length;\n    String[] fullFileNames  = new String[ numFiles ];\n    String   fileNamePrefix = _getFileNamePrefix();\n    String   fileNameSuffix = _getFileNameSuffix();\n\n    for( int fileI = 0; fileI < numFiles; fileI++ ) {\n      fullFileNames[ fileI ] = fileNamePrefix + fileNameRoots[ fileI ] + fileNameSuffix;\n    }\n\n    return fullFileNames;\n  }\n\n\n\n  /** Set the root of the name of the file to be written. \n   *  @param rFileNameRoot Root of the name of file to be written.\n   */\n  public void _setFileNameRoot( String rFileNameRoot ) {\n    if( null == rFileNameRoot ) {\n      return; // ignore\n    }\n    _setFileNameRoots( new String[] { rFileNameRoot } );\n  }\n\n\n\n  /** Get the root of the name of current file being generated. */\n  public String _getFileNameRoot() {\n    if( 0 < writer__iFileNameRoots.length ) {\n      return writer__iFileNameRoots[ writer__iCurrentFileIndex ];\n    }\n    return \"\";\n  }\n\n\n\n  /** Set the roots of the names of the files to be written. \n   *  @param rFileNameRoots Roots of names of files to be written.\n   */\n  public void _setFileNameRoots( String[] rFileNameRoots ) {\n    if( null == rFileNameRoots ) {\n      return; // ignore\n    }\n\n    // copy\n    String[] roots = (String[]) rFileNameRoots.clone();\n\n    // normalize - replace nulls\n    int numRoots = roots.length;\n    for(int rootI = 0; rootI < numRoots; rootI++) {\n      if( null == roots[ rootI ] ) {\n        roots[ rootI ] = \"\";\n      }\n    }\n\n    // save roots\n    writer__iFileNameRoots = roots;\n    writer__iNumFiles      = numRoots;\n  }\n\n\n\n  /** Get roots of the names of files to be written. */\n  public String[] _getFileNameRoots() {\n    return writer__iFileNameRoots;\n  }\n\n\n\n  /** Get index of file currently being generated. */\n  public int _getFileIndex() {\n    return writer__iCurrentFileIndex;\n  }\n\n\n\n  /** Get number of generated files. */\n  public int _getNumFiles() {\n    return writer__iNumFiles;\n  }\n\n\n\n  /** Set output folder.\n   *  @param rOutputFolder Folder to output generated code to.\n   */\n  public void _setOutputFolder( String rOutputFolder ) {\n    writer__iOutputFolder = rOutputFolder;\n  }\n\n\n\n  /** Get output folder. */\n  public String _getOutputFolder() {\n    return writer__iOutputFolder;\n  }\n\n\n\n  /** Set backup folder.\n   *  @param rBackupFolder Folder to backup overwritten files to.\n   */\n  public void _setBackupFolder( String rBackupFolder ) {\n    writer__iBackupFolder = writer__iOutputFolder + \"$<\\jostraca.system.fileSeparator>\" + rBackupFolder;\n  }\n\n\n\n  /** Get backup folder. */\n  public String _getBackupFolder() {\n    return writer__iBackupFolder;\n  }\n\n\n\n  /** Set the suffix of backup files.\n   *  @param rSuffix Backup files suffix.\n   */\n  public void _setBackupSuffix( String rSuffix ) {\n    if( null == rSuffix ) {\n      return; // ignore\n    }\n    writer__iBackupSuffix = rSuffix;\n  }\n\n\n\n  /** Set the prefix of backup files.\n   *  @param rPrefix Backup files prefix.\n   */\n  public void _setBackupPrefix( String rPrefix ) {\n    if( null == rPrefix ) {\n      return; // ignore\n    }\n    writer__iBackupPrefix = rPrefix;\n  }\n\n\n\n  /** Set to true if written files are to be backed up to disk automatically. \n   *  @param rBackup True => Backup files to disk.\n   */\n  public void _backup( boolean rBackup ) {\n    writer__iBackup = rBackup;\n  }\n\n\n\n  /** Set to true if written files are to be saved to disk automatically. \n   *  @param rSave True => Save written files to disk.\n   */\n  public void _save( boolean rSave ) {\n    writer__iSave = rSave;\n  }\n\n\n  /* Template Services (File Generation) >> */\n\n\n\n\n  /* Template Services (Control) << */\n\n  /** Get compile time property\n   *  @param rName Name of property to get.\n   */\n  public String _getProperty( String rName ) {\n    String result = \"\";\n\n    if( ! writer__iPropertiesInitialised ) {\n      writer__initProperties();\n    }\n\n    if( writer__iProperties.containsKey( rName ) ) {\n      result = (String) writer__iProperties.get( rName );\n    }\n\n    return result;\n  }\n\n  /* Template Services (Control) >> */\n\n\n\n  /* Template Services (Text Production) << */\n\n\n  // inserts\n  // ...\n\n  /** Insert text into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rText Text to insert.\n   */\n  public void _insert( String rText ) {\n    writer__iCurrentText.append( rText );\n  }\n\n  /** Insert string representation of object into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rObject Object to insert.\n   */\n  public void _insert( Object rObject ) {\n    writer__iCurrentText.append( \"\"+rObject );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rInt int to insert\n   */\n  public void _insert( int rInt ) {\n    writer__iCurrentText.append( rInt );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rLong long to insert\n   */\n  public void _insert( long rLong ) {\n    writer__iCurrentText.append( rLong );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rShort short to insert\n   */\n  public void _insert( short rShort ) {\n    writer__iCurrentText.append( rShort );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rByte byte to insert\n   */\n  public void _insert( byte rByte ) {\n    writer__iCurrentText.append( rByte );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rDouble double to insert\n   */\n  public void _insert( double rDouble ) {\n    writer__iCurrentText.append( rDouble );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rFloat float to insert\n   */\n  public void _insert( float rFloat ) {\n    writer__iCurrentText.append( rFloat );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rChar char to insert\n   */\n  public void _insert( char rChar ) {\n    writer__iCurrentText.append( rChar );\n  }\n\n  /** Insert string representation of primitive data type into written file. \n   *  Abbreviated by <%=foobar%>. \n   *  @param rBoolean boolean to insert\n   */\n  public void _insert( boolean rBoolean ) {\n    writer__iCurrentText.append( rBoolean );\n  }\n\n\n\n  /** Create a String containing specified number of spaces.\n   *  @param rNumSpaces Number of spaces to place in String\n   */\n  public String _spaces( int rNumSpaces ) {\n    int numSpaces = rNumSpaces;\n    if( 0 > numSpaces ) { numSpaces *= -1; }\n    StringBuffer spaces = new StringBuffer( numSpaces );\n    for(int spaceI = 0; spaceI < numSpaces; spaceI++) {\n      spaces.append(\" \");\n    }\n    return spaces.toString();\n  }\n\n\n\n  /** Left align String with spaces. */ \n  public String _left( String rText, int rColWidth ) {\n    return _align( rText, \" \", rColWidth, 'l' );\n  } \n\n\n\n  /** Right align String with spaces. */ \n  public String _right( String rText, int rColWidth ) {\n    return _align( rText, \" \", rColWidth, 'r' );\n  } \n\n\n\n  /** Center align String with spaces. */ \n  public String _center( String rText, int rColWidth ) {\n    return _align( rText, \" \", rColWidth, 'c' );\n  } \n\n\n\n  /** Align text within background text to specified column width. \n   *  Alignment can be 'l': left, 'c': center, 'r': right\n   */\n  public String _align( String rText, String rBackText, int rColWidth, char rAlignment ) {\n    String result = rText;\n \n    if( null == rText ) { \n       result = \"\"; \n    }\n    else if( null != rBackText ) {\n      try {\n        int textLen = rText.length();\n        if( rColWidth > textLen ) {\n          int    backTextLen     = rBackText.length();\n          int    remainWidth     = rColWidth - textLen;\n          int    backTextRepeats = remainWidth / backTextLen;\n          int    backTextRemain  = remainWidth % backTextLen;\n          String back            = \"\";\n          for( int backTextI = 0; backTextI < backTextRepeats; backTextI++ ) {\n            back = back + rBackText;\n          }\n          back = back + rBackText.substring( 0, backTextRemain );\n \n          switch( rAlignment ) {\n          case 'l':\n            result = result + back;\n            break;\n          case 'c':\n            result = back.substring( 0, (back.length()/2) ) + result + back.substring( (back.length()/2) );\n            break;\n          case 'r':\n            result = back + result;\n            break;\n          }\n        }\n      } \n      catch( Exception e ) {\n        result = rText;\n      }\n    }\n    return result;\n  }\n\n\n\n  /** Set current text of file currently being generated. */\n  public void _setText( String rText) {\n    writer__iCurrentText = new StringBuffer( rText );\n  }\n\n\n\n  /** Get current text of file currently being generated. */\n  public String _getText() {\n    return writer__iCurrentText.toString();\n  }\n\n  /* Template Services (Text Production) << */\n\n}\n\n\n!<footer>\n");
    }
}