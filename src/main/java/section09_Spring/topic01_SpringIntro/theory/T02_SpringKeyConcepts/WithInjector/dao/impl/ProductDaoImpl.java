package section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.dao.impl;

import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.dao.ProductDao;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.lib.Dao;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.model.Product;
import section09_Spring.topic01_SpringIntro.theory.T02_SpringKeyConcepts.WithInjector.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class ProductDaoImpl implements ProductDao {
    @Override
    public Product save(Product product) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save product to DB", e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return product;
    }

    @Override
    public List<Product> findAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<Product> query = session.createQuery(
                    "FROM Product", Product.class);
            return query.getResultList();
        }
    }
}
