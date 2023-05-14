package section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.impl;

import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.dao.TicketDao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.exception.DataProcessingException;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.lib.Dao;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.model.Ticket;
import section08_Hibernate.topic08_DBChangesManagementTools.practice.HibernateOrder.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class TicketDaoImpl implements TicketDao {
    @Override
    public Ticket add(Ticket ticket) {
        Session session = null;
        Transaction transaction = null;
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
            throw new DataProcessingException("Can't insert a ticket: " + ticket, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
