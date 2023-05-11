package section08_Hibernate.topic05_CriteriaAPI.practice.HibernateCriteriaQuery.dao;

import org.hibernate.SessionFactory;

public abstract class AbstractDao {
    protected final SessionFactory factory;

    protected AbstractDao(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }
}
