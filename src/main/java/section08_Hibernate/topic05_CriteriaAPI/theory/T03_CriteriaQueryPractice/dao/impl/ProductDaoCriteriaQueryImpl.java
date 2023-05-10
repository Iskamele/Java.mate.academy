package section08_Hibernate.topic05_CriteriaAPI.theory.T03_CriteriaQueryPractice.dao.impl;

import java.math.BigDecimal;
import java.util.List;
import section08_Hibernate.topic05_CriteriaAPI.theory.T03_CriteriaQueryPractice.util.HibernateUtil;
import section08_Hibernate.topic05_CriteriaAPI.theory.T03_CriteriaQueryPractice.dao.ProductDao;
import section08_Hibernate.topic05_CriteriaAPI.theory.T03_CriteriaQueryPractice.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class ProductDaoCriteriaQueryImpl implements ProductDao {
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
    public List<Product> findAllWherePriceBetween(BigDecimal from, BigDecimal to) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Product> query = cb.createQuery(Product.class);
            Root<Product> productRoot = query.from(Product.class);
            Predicate priceGt = cb.gt(productRoot.get("price"), from);
            Predicate priceLt = cb.lt(productRoot.get("price"), to);
            // SELECT FROM products WHERE price > :from AND price < :50
            Predicate pricePredicate = cb.and(priceGt, priceLt);
            query.where(pricePredicate);
            return session.createQuery(query).getResultList();
        }
    }

    @Override
    public List<Product> findAllWherePriceBetweenAndColorIn(BigDecimal from, BigDecimal to, String[] colors) {
        return null;
    }

    @Override
    public List<Product> findAllWherePriceBetweenOrColorIn(BigDecimal from, BigDecimal to, String[] colors) {
        return null;
    }
}
