package section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.dao.impl;

import section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.dao.ProductDao;
import section08_Hibernate.topic010_HibernateCacheLevels.theory.T02_FirstLevelCache.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductDaoImpl implements ProductDao {
    private SessionFactory sessionFactory;

    public ProductDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Product save(Product product) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
            return product;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save product " + product, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Product get(Long id) {
        try (Session session = sessionFactory.openSession()) {
            Product result = session.get(Product.class, id);
            Product secondResult = session.get(Product.class, id);
            return result;
        }
    }
}
