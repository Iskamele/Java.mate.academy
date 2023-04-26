package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.model.Product;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.util.EntityManagerUtil;

public class JpaProductDaoImpl implements ProductDao {
    @Override
    public Product save(Product product) {
        EntityManagerFactory entityManagerFactory = EntityManagerUtil
                .getEntityManagerFactory();
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin(); // вручную начать транзакцию
            entityManager.persist(product);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save product to DB, ", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return product;
    }

    @Override
    public Product get(Long id) {
        return null;
    }

    @Override
    public Product remove(Product product) {
        return null;
    }
}
