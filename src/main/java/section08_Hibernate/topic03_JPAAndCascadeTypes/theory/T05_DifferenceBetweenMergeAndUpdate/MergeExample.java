package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T05_DifferenceBetweenMergeAndUpdate;

import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T03_JPABasedDAOImplementation.model.Product;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T05_DifferenceBetweenMergeAndUpdate.util.EntityManagerUtil;

public class MergeExample {

    public static void main(String[] args) {
        Product iPhone = new Product();
        iPhone.setName("iPhone 13");
        iPhone.setPrice(BigDecimal.valueOf(1500));

        EntityManagerFactory entityManagerFactory = EntityManagerUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        System.out.println("before persist");
        entityManager.persist(iPhone);
        System.out.println("after save");
        System.out.println("before persist");
        transaction.commit();
        System.out.println("after commit");

        entityManager.close();

        iPhone.setName("iPhone 8");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();

        transaction.begin();
        System.out.println("before merge");
        entityManager.merge(iPhone);
        System.out.println("after merge");
        System.out.println("before commit");
        transaction.commit();
        System.out.println("after commit");

        entityManager.close();
    }
}
