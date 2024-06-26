package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.impl;

import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.SmileDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.Smile;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SmileDaoImpl extends AbstractDao implements SmileDao {
    public SmileDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Smile create(Smile entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't create smile for: " + entity.getValue(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public Smile get(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(Smile.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get smile by ID: " + id, e);
        }
    }

    @Override
    public List<Smile> getAll() {
//        try (Session session = factory.openSession()) {
//            Query<Smile> allSmiles = session.createQuery(
//                    "FROM Smile ", Smile.class);
//            return allSmiles.getResultList();
//        } catch (Exception e) {
//            throw new RuntimeException("Can't get all smiles, ", e);
//        }
        return null;
    }
}
