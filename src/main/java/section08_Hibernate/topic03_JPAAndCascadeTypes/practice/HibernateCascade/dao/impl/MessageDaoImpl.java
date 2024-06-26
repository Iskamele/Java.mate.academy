package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.impl;

import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.MessageDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.Message;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MessageDaoImpl extends AbstractDao implements MessageDao {
    public MessageDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Message create(Message entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't create message for: " + entity.getContent(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public Message get(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(Message.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get message by ID: " + id, e);
        }
    }

    @Override
    public List<Message> getAll() {
//        try (Session session = factory.openSession()) {
//            Query<Message> allMessages = session.createQuery(
//                    "FROM Message ", Message.class);
//            return allMessages.getResultList();
//        } catch (Exception e) {
//            throw new RuntimeException("Can't get all messages, ", e);
//        }
        return null;
    }

    @Override
    public void remove(Message entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't remove mesage for: " + entity.getContent(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
