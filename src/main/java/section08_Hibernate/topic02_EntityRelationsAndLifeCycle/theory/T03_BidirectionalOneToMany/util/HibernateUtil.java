package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T03_BidirectionalOneToMany.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory instance = initSessionFactory();

    private HibernateUtil() {
    }

    private static SessionFactory initSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return instance;
    }
}
