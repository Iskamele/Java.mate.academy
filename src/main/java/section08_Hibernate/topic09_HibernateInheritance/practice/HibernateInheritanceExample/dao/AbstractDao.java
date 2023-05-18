package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao;

import org.hibernate.SessionFactory;

public abstract class AbstractDao {
    protected final SessionFactory sessionFactory;

    protected AbstractDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
