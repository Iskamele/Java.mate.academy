package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.exception.DataProcessingException;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.model.Product;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T07_FetchTypeLazyInitializationException.Lazy.util.HibernateUtil;

public class ProductDaoImpl implements ProductDao {

    @Override
    public Product save(Product movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add product to DB for : " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Product get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.get(Product.class, id);
        } catch (Exception e) {
            throw new DataProcessingException("Can't get product by ID: " + id, e);
        }
    }
}
