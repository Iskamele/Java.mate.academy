package section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.impl;

import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.AbstractDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.dao.TicketDao;
import section09_Spring.topic05_RESTPractice.practice.SpringRestWebPractice.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
