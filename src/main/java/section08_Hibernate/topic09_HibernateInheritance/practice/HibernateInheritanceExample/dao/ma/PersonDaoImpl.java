package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.AbstractDao;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PersonDaoImpl extends AbstractDao implements PersonDao {
    public PersonDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Person save(Person person) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save person to DB: " + person, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return person;
    }
}