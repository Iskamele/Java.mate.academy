package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Review;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ReviewDaoImpl implements ReviewDao {
    @Override
    public Review save(Review entity) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save review to DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public Review get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.get(Review.class, id);
        }
    }
}
