package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initSessionFactory();

    private static SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();

    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}