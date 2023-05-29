package section09_Spring.topic05_RESTPractice.theory.T03_GlobalExceptionHandler.dao.impl;

import java.util.List;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import section09_Spring.topic05_RESTPractice.theory.T03_GlobalExceptionHandler.dao.ProductDao;
import section09_Spring.topic05_RESTPractice.theory.T03_GlobalExceptionHandler.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

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
    public Optional<Product> get(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        try (Session session = sessionFactory.openSession()) {
            Query<Product> query = session.createQuery(
                    "FROM Product", Product.class);
            return query.getResultList();
        }
    }

    @Override
    public List<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
