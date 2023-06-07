package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.AbstractDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.TicketDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.Ticket;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
