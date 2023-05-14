package section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.dao.impl;

import java.util.List;
import section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.dao.ProductDao;
import section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.model.Product;
import section08_Hibernate.topic08_DBChangesManagementTools.theory.T01_DatabaseChangeManagementTools.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ProductDaoImpl implements ProductDao {
    @Override
    public Product save(Product product) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(product);
            transaction.commit();
            return product;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert product " + product, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Product get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.get(Product.class, id);
        }
    }

    @Override
    public List<Product> findAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<Product> getAllProductsQuery = session.createQuery(
                    "FROM Product", Product.class);
            return getAllProductsQuery.getResultList();
        }
    }
}
