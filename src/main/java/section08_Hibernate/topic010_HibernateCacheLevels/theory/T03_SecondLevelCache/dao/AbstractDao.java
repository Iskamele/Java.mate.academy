package section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.dao;

import org.hibernate.SessionFactory;

public abstract class AbstractDao {
    protected final SessionFactory factory;

    protected AbstractDao(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }
}
