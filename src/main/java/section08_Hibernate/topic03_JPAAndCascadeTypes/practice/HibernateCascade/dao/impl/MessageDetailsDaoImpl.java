package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.impl;

import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.MessageDetailsDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.MessageDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MessageDetailsDaoImpl extends AbstractDao implements MessageDetailsDao {
    public MessageDetailsDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public MessageDetails create(MessageDetails entity) {
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
            throw new RuntimeException("Can't create message details for: "
                    + entity.getSender() + ", " + entity.getSentTime(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public MessageDetails get(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(MessageDetails.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get message details by ID: " + id, e);
        }
    }
}
