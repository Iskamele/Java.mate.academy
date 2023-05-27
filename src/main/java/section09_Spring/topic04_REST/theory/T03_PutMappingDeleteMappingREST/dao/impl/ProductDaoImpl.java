package section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.dao.impl;

import java.util.List;
import java.util.Optional;
import section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.model.Product;
import section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.dao.ProductDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
            Query<section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.model.Product> query = session.createQuery(
                    "FROM Product", section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.model.Product.class);
            return query.getResultList();
        }
    }

    @Override
    public List<section09_Spring.topic04_REST.theory.T03_PutMappingDeleteMappingREST.model.Product> findByBrand(String brand) {
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
