public class BigbenchClone{    
    public void setDefaultDomain(final int domainId) {
        try {
            connection.setAutoCommit(false);
            new ProcessEnvelope().executeNull(new ExecuteProcessAbstractImpl(connection, false, false, true, true) {

                
                public void executeProcessReturnNull() throws SQLException {
                    psImpl = connImpl.prepareStatement(sqlCommands.getProperty("domain.setDefaultDomainId"));
                    psImpl.setInt(1, domainId);
                    psImpl.executeUpdate();
                }
            });
            connection.commit();
            cm.updateDefaultDomain();
        } catch (SQLException sqle) {
            log.error(sqle);
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                }
            }
        } finally {
            if (connection != null) {
                try {
                    connection.setAutoCommit(true);
                } catch (SQLException ex) {
                }
            }
        }
    }
}