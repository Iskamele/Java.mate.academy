package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.dao;

import java.math.BigDecimal;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.util.HibernateUtil;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T01_HQL.model.Product;
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

    @Override
    public List<Product> findAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            Query<Product> getAllProductsQuery = session.createQuery(
                    "FROM Product", Product.class);
            return getAllProductsQuery.getResultList();
        }
    }

    @Override
    public List<Product> findAllWherePriceGreaterThan(BigDecimal price) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession();) {
            Query<Product> getAllProductsQuery = session.createQuery(
                    "FROM Product p WHERE p.price > :value", Product.class);
            getAllProductsQuery.setParameter("value", price);
            return getAllProductsQuery.getResultList();
        }
    }
}
