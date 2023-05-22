package section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.dao.ProductDao;
import section09_Spring.topic01_SpringIntro.theory.T06_PropertiesFileUsage.model.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Repository
public class ProductDaoImpl implements ProductDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public ProductDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Product save(Product product) {
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
        try (Session session = sessionFactory.openSession()) {
            Query<Product> query = session.createQuery(
                    "FROM Product", Product.class);
            return query.getResultList();
        }
    }
}
