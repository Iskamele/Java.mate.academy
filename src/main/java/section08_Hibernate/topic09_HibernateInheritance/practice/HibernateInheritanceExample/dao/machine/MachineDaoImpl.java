package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.machine;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.AbstractDao;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.machine.Machine;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class MachineDaoImpl extends AbstractDao implements MachineDao {
    public MachineDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Machine save(Machine machine) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(machine);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save machine to DB: " + machine, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return machine;
    }

    @Override
    public List<Machine> findByAgeOlderThan(int age) {
        try (Session session = sessionFactory.openSession()) {
            int currentYear = LocalDate.now().getYear();
            Query<Machine> query = session.createQuery("FROM Machine m "
                    + "WHERE m.year < :age");
            query.setParameter("age", currentYear - age);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't find machine by age older than: " + age, e);
        }
    }
}
