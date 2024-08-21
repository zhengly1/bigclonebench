public class BigbenchClone{    
    public void deleteMythread(Integer tid) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            String hql = "DELETE FROM Mythreads AS m WHERE m.id.tid=?";
            Query query = session.createQuery(hql);
            query.setInteger(0, tid);
            query.executeUpdate();
            transaction.commit();
        } catch (Exception exception) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}