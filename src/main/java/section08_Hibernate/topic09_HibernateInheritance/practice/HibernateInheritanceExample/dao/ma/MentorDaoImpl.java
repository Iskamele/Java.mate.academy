package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Mentor;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class MentorDaoImpl extends PersonDaoImpl implements MentorDao {
    public MentorDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<Mentor> findByAgeGreaterThan(int age) {
        try (Session session = sessionFactory.openSession()) {
            Query<Mentor> query = session.createQuery("FROM Person p "
                    + "WHERE p.age > :age");
            query.setParameter("age", age);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't find mentor by age greater than: " + age, e);
        }
    }
}
