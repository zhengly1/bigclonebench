public class BigbenchClone{    
    private org.omg.CORBA.portable.OutputStream _OB_op_resume_connection(org.omg.CORBA.portable.InputStream in, org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream out = null;
        try {
            resume_connection();
            out = handler.createReply();
        } catch (org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActive _ob_ex) {
            out = handler.createExceptionReply();
            org.omg.CosNotifyChannelAdmin.ConnectionAlreadyActiveHelper.write(out, _ob_ex);
        }
        return out;
    }
}