package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.animal;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.AbstractDao;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.zoo.Animal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class AnimalDaoImpl extends AbstractDao implements AnimalDao {
    public AnimalDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Animal save(Animal animal) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(animal);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save animal to DB: " + animal, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return animal;
    }

    @Override
    public List<Animal> findByNameFirstLetter(Character character) {
        try (Session session = sessionFactory.openSession()) {
            Query<Animal> query = session.createQuery("FROM Animal a "
                    + "WHERE LOWER(a.name) LIKE LOWER(:pattern)");
            query.setParameter("pattern", character + "%");
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't find animal by name first letter: " + character, e);
        }
    }
}
