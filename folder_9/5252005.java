public class BigbenchClone{    
    private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context) throws Throwable {
        PageContext pageContext = _jspx_page_context;
        JspWriter out = _jspx_page_context.getOut();
        org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
        _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
        _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
        _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task eq 'view'}", java.lang.Boolean.class, (PageContext) _jspx_page_context, null, false)).booleanValue());
        int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
        if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
                out.write("\r\n");
                out.write("\t\t<h3>Benutzer anzeigen</h3>\r\n");
                out.write("\t\t<form action=\"\" method=\"get\" accept-charset=\"UTF-8\" class=\"yform columnar\">\r\n");
                out.write("\t\t");
                out.write("\r\n");
                out.write("\r\n");
                out.write("\r\n");
                out.write("\r\n");
                if (_jspx_meth_fmt_005fsetBundle_005f1(_jspx_th_c_005fwhen_005f2, _jspx_page_context)) return true;
                out.write('\r');
                out.write('\n');
                if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fwhen_005f2, _jspx_page_context)) return true;
                out.write("\r\n");
                out.write("<fieldset><legend>Persönliche Angaben</legend>\r\n");
                out.write("<div class=\"type-text\"><label for=\"firstName\">Vorname:<sup>*</sup></label>\r\n");
                out.write("<input id=\"firstName\" name=\"firstName\" type=\"text\" size=\"30\"\r\n");
                out.write("\tmaxlength=\"32\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.firstName}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("<div class=\"type-text\"><label for=\"lastName\">Nachname:<sup>*</sup></label>\r\n");
                out.write("<input id=\"lastName\" name=\"lastName\" type=\"text\" size=\"30\"\r\n");
                out.write("\tmaxlength=\"32\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.lastName}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("<div class=\"type-text\"><label for=\"birthday\">Geburtsdatum:<sup>*</sup></label>\r\n");
                out.write("<input id=\"birthday\" name=\"birthday\" type=\"text\" size=\"30\"\r\n");
                out.write("\tmaxlength=\"10\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.birthday}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("</fieldset>\r\n");
                out.write("<fieldset><legend>Anmeldedaten</legend>\r\n");
                out.write("<div class=\"type-text\"><label for=\"login\">Benutzername:<sup>*</sup></label>\r\n");
                out.write("<input id=\"login\" name=\"login\" class=\"required\" type=\"text\" size=\"30\"\r\n");
                out.write("\tmaxlength=\"16\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.login}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fwhen_005f2, _jspx_page_context)) return true;
                out.write("</fieldset>\r\n");
                out.write("<fieldset><legend>Anschrift</legend>\r\n");
                out.write("<div class=\"type-text\"><label for=\"postal_code\">PLZ:<sup>*</sup></label>\r\n");
                out.write("<input id=\"postal_code\" name=\"postal_code\" type=\"text\" size=\"30\"\r\n");
                out.write("\tmaxlength=\"5\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.zipCode}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("<div class=\"type-text\"><label for=\"city\">Stadt:<sup>*</sup></label>\r\n");
                out.write("<input id=\"city\" name=\"city\" type=\"text\" size=\"30\" maxlength=\"30\"\r\n");
                out.write("\tvalue=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.city}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("<div class=\"type-text\"><label for=\"street\">Straße:<sup>*</sup></label>\r\n");
                out.write("<input id=\"street\" name=\"street\" type=\"text\" size=\"30\" maxlength=\"64\"\r\n");
                out.write("\tvalue=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.streetName}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("<div class=\"type-text\"><label for=\"house_number\">Hausnummer:<sup>*</sup></label>\r\n");
                out.write("<input id=\"house_number\" name=\"house_number\" type=\"text\" size=\"30\"\r\n");
                out.write("\tmaxlength=\"6\" value=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.houseNumber}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("</fieldset>\r\n");
                out.write("<fieldset><legend>Kommunikation</legend>\r\n");
                out.write("<div class=\"type-text\"><label for=\"phone\">Telefon:<sup>*</sup></label>\r\n");
                out.write("<input id=\"phone\" name=\"phone\" type=\"text\" size=\"30\" maxlength=\"32\"\r\n");
                out.write("\tvalue=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phone}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("<div class=\"type-text\"><label for=\"email\">E-Mail:<sup>*</sup></label>\r\n");
                out.write("<input id=\"email\" name=\"email\" type=\"text\" size=\"30\" maxlength=\"64\"\r\n");
                out.write("\tvalue=\"");
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('"');
                out.write(' ');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write('=');
                out.write('"');
                out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${readonly}", java.lang.String.class, (PageContext) _jspx_page_context, null, false));
                out.write("\" /></div>\r\n");
                out.write("</fieldset>\r\n");
                if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fwhen_005f2, _jspx_page_context)) return true;
                out.write('\r');
                out.write('\n');
                if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fwhen_005f2, _jspx_page_context)) return true;
                out.write("\r\n");
                out.write("\t\t</form>\r\n");
                out.write("\t\t");
                if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fwhen_005f2, _jspx_page_context)) return true;
                out.write('\r');
                out.write('\n');
                out.write('	');
                int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) break;
            } while (true);
        }
        if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
            return true;
        }
        _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
        return false;
    }
}