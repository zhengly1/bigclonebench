public class BigbenchClone{    
    public void deleteByCondition(String condition) {
        Transaction tx = getSession().beginTransaction();
        try {
            String hql = "delete RoleProcess ";
            if (null != condition) {
                hql += "where ";
                hql += condition;
            }
            getSession().createQuery(hql).executeUpdate();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }
}