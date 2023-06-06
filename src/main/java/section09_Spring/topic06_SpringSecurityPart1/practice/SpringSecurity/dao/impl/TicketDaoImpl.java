package section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.dao.TicketDao;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.exception.DataProcessingException;
import section09_Spring.topic06_SpringSecurityPart1.practice.SpringSecurity.model.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {
    private final SessionFactory factory;

    public TicketDaoImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Ticket add(Ticket ticket) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = factory.openSession();
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
