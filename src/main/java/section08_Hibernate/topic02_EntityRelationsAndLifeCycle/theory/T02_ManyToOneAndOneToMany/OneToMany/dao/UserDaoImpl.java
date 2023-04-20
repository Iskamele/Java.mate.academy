package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.exception.DataProcessingException;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.util.HibernateUtil;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T02_ManyToOneAndOneToMany.OneToMany.model.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User save(User user) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add user to DB for : " + user, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public User get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.get(User.class, id);
        } catch (Exception e) {
            throw new DataProcessingException("Can't get user by ID: " + id, e);
        }
    }
}
