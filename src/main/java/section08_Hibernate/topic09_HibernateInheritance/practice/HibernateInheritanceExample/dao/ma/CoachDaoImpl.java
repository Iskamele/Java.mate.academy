package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.ma;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma.Coach;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CoachDaoImpl extends PersonDaoImpl implements CoachDao {
    public CoachDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<Coach> findByExperienceGreaterThan(int years) {
        try (Session session = sessionFactory.openSession()) {
            Query<Coach> query = session.createQuery("FROM Coach c "
                    + "WHERE c.experience > :years");
            query.setParameter("years", years);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't find coach experience greater than: " + years, e);
        }
    }
}
