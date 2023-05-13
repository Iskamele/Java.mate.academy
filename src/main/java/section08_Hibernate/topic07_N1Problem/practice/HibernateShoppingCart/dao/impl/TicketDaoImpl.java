package section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.impl;

import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.dao.TicketDao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.exception.DataProcessingException;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.lib.Dao;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.model.Ticket;
import section08_Hibernate.topic07_N1Problem.practice.HibernateShoppingCart.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class TicketDaoImpl implements TicketDao {
    @Override
    public Ticket add(Ticket ticket) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(ticket);
            transaction.commit();
            return ticket;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert ticket " + ticket, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
