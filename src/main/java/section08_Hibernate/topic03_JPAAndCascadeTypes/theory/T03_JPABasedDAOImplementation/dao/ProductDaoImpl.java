package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.model.Product;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.util.HibernateUtil;

public class ProductDaoImpl implements ProductDao {

    @Override
    public Product save(Product product) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save product to DB, ", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    @Override
    public Product get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.get(Product.class, id);
    }

    @Override
    public Product remove(Product product) {
        SessionFactory sessionFactory = section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.util.HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't remove product from DB, ", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }
}
