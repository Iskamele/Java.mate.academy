package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T05_DifferenceBetweenMergeAndUpdate.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
    private static final EntityManagerFactory entityManagerFactory = initEntityManagerFactory();

    private static EntityManagerFactory initEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("mate.academy.ticket_app");
    }


    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
