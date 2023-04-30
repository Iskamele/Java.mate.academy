package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.impl;

import org.hibernate.SessionFactory;

public abstract class AbstractDao {
    protected final SessionFactory factory;

    protected AbstractDao(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }
}
