package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.dao;

import java.math.BigDecimal;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.model.Product;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T02_LazyInitializationException.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
        try (Session session = sessionFactory.openSession();) {
            return session.get(Product.class, id);
        }
    }
}
