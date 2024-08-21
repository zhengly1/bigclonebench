public class BigbenchClone{    
    public void emitHelp(String fullReportFileName, APIDiff apiDiff) {
        String helpFileName = fullReportFileName + JDiff.DIR_SEP + "jdiff_help" + h_.reportFileExt;
        try {
            FileOutputStream fos = new FileOutputStream(helpFileName);
            h_.reportFile = new PrintWriter(fos);
            h_.writeStartHTMLHeader();
            h_.writeHTMLTitle("JDiff Help");
            h_.writeStyleSheetRef();
            h_.writeText("</HEAD>");
            h_.writeText("<BODY>");
            h_.writeText("<!-- Start of nav bar -->");
            h_.writeText("<TABLE summary=\"Navigation bar\" BORDER=\"0\" WIDTH=\"100%\" CELLPADDING=\"1\" CELLSPACING=\"0\">");
            h_.writeText("<TR>");
            h_.writeText("<TD COLSPAN=2 BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\">");
            h_.writeText("  <TABLE summary=\"Navigation bar\" BORDER=\"0\" CELLPADDING=\"0\" CELLSPACING=\"3\">");
            h_.writeText("    <TR ALIGN=\"center\" VALIGN=\"top\">");
            h_.writeText("      <TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\"> <A HREF=\"" + h_.newDocPrefix + "index.html\" target=\"_top\"><FONT CLASS=\"NavBarFont1\"><B><tt>" + apiDiff.newAPIName_ + "</tt></B></FONT></A>&nbsp;</TD>");
            h_.writeText("      <TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\"> <A HREF=\"" + h_.reportFileName + "-summary" + h_.reportFileExt + "\"><FONT CLASS=\"NavBarFont1\"><B>Overview</B></FONT></A>&nbsp;</TD>");
            h_.writeText("      <TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\"> &nbsp;<FONT CLASS=\"NavBarFont1\">Package</FONT>&nbsp;</TD>");
            h_.writeText("      <TD BGCOLOR=\"#FFFFFF\" CLASS=\"NavBarCell1\"> &nbsp;<FONT CLASS=\"NavBarFont1\">Class</FONT>&nbsp;</TD>");
            if (!Diff.noDocDiffs) {
                h_.writeText("      <TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\"> <A HREF=\"" + Diff.diffFileName + "index" + h_.reportFileExt + "\"><FONT CLASS=\"NavBarFont1\"><B>Text Changes</B></FONT></A>&nbsp;</TD>");
            }
            if (h_.doStats) {
                h_.writeText("      <TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1\"> <A HREF=\"jdiff_statistics" + h_.reportFileExt + "\"><FONT CLASS=\"NavBarFont1\"><B>Statistics</B></FONT></A>&nbsp;</TD>");
            }
            h_.writeText("      <TD BGCOLOR=\"#EEEEFF\" CLASS=\"NavBarCell1Rev\"> &nbsp;<FONT CLASS=\"NavBarFont1Rev\"><B>Help</B></FONT>&nbsp;</TD>");
            h_.writeText("    </TR>");
            h_.writeText("  </TABLE>");
            h_.writeText("</TD>");
            h_.writeText("<TD ALIGN=\"right\" VALIGN=\"top\" ROWSPAN=3><EM><b>Generated by<br><a href=\"" + JDiff.jDiffLocation + "\" class=\"staysblack\" target=\"_top\">JDiff</a></b></EM></TD>");
            h_.writeText("</TR>");
            h_.writeText("<TR>");
            h_.writeText("  <TD BGCOLOR=\"" + h_.bgcolor + "\" CLASS=\"NavBarCell2\"><FONT SIZE=\"-2\"></FONT>");
            h_.writeText("</TD>");
            h_.writeText("  <TD BGCOLOR=\"" + h_.bgcolor + "\" CLASS=\"NavBarCell2\"><FONT SIZE=\"-2\">");
            h_.writeText("  <A HREF=\"" + "../" + h_.reportFileName + h_.reportFileExt + "\" TARGET=\"_top\"><B>FRAMES</B></A>  &nbsp;");
            h_.writeText("  &nbsp;<A HREF=\"jdiff_help" + h_.reportFileExt + "\" TARGET=\"_top\"><B>NO FRAMES</B></A></FONT></TD>");
            h_.writeText("</TR>");
            h_.writeText("</TABLE>");
            h_.writeText("<HR>");
            h_.writeText("<!-- End of nav bar -->");
            h_.writeText("<center>");
            h_.writeText("<H1>JDiff Documentation</H1>");
            h_.writeText("</center>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("JDiff is a <a href=\"http://java.sun.com/j2se/javadoc/\" target=\"_top\">Javadoc</a> doclet which generates a report of the API differences between two versions of a product. It does not report changes in Javadoc comments, or changes in what a class or method does. ");
            h_.writeText("This help page describes the different parts of the output from JDiff.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText(" See the reference page in the <a href=\"" + JDiff.jDiffLocation + "\">source for JDiff</a> for information about how to generate a report like this one.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("The indexes shown in the top-left frame help show each type of change in more detail. The index \"All Differences\" contains all the differences between the APIs, in alphabetical order. ");
            h_.writeText("These indexes all use the same format:");
            h_.writeText("<ul>");
            h_.writeText("<li>Removed packages, classes, constructors, methods and fields are <strike>struck through</strike>.</li>");
            h_.writeText("<li>Added packages, classes, constructors, methods and fields appear in <b>bold</b>.</li>");
            h_.writeText("<li>Changed packages, classes, constructors, methods and fields appear in normal text.</li>");
            h_.writeText("</ul>");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("You can always tell when you are reading a JDiff page, rather than a Javadoc page, by the color of the index bar and the color of the background. ");
            h_.writeText("Links which take you to a Javadoc page are always in a <tt>typewriter</tt> font. ");
            h_.writeText("Just like Javadoc, all interface names are in <i>italic</i>, and class names are not italicized. Where there are multiple entries in an index with the same name, the heading for them is also in italics, but is not a link.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3><b><tt>Javadoc</tt></b></H3>");
            h_.writeText("This is a link to the <a href=\"" + h_.newDocPrefix + "index.html\" target=\"_top\">top-level</a> Javadoc page for the new version of the product.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Overview</H3>");
            h_.writeText("The <a href=\"" + h_.reportFileName + "-summary" + h_.reportFileExt + "\">overview</a> is the top-level summary of what was removed, added and changed between versions.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Package</H3>");
            h_.writeText("This is a link to the package containing the current changed class or interface.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Class</H3>");
            h_.writeText("This is highlighted when you are looking at the changed class or interface.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Text Changes</H3>");
            h_.writeText("This is a link to the top-level index of all documentation changes for the current package or class. ");
            h_.writeText("If it is not present, then there are no documentation changes for the current package or class. ");
            h_.writeText("This link can be removed entirely by not using the <code>-docchanges</code> option.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Statistics</H3>");
            h_.writeText("This is a link to a page which shows statistics about the changes between the two APIs.");
            h_.writeText("This link can be removed entirely by not using the <code>-stats</code> option.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Help</H3>");
            h_.writeText("A link to this Help page for JDiff.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Prev/Next</H3>");
            h_.writeText("These links take you to the previous  and next changed package or class.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H3>Frames/No Frames</H3>");
            h_.writeText("These links show and hide the HTML frames. All pages are available with or without frames.");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeText("<BLOCKQUOTE>");
            h_.writeText("<H2>Complex Changes</H2>");
            h_.writeText("There are some complex changes which can occur between versions, for example, when two or more methods with the same name change simultaneously, or when a method or field is moved into or from a superclass. ");
            h_.writeText("In these cases, the change will be seen as a removal and an addition, rather than as a change. Unexpected removals or additions are often part of one of these type of changes. ");
            h_.writeText("</BLOCKQUOTE>");
            h_.writeHTMLFooter();
            h_.reportFile.close();
        } catch (IOException e) {
            System.out.println("IO Error while attempting to create " + helpFileName);
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}