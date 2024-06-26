package section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.impl;

import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.dao.CommentDao;
import section08_Hibernate.topic03_JPAAndCascadeTypes.practice.HibernateCascade.model.Comment;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CommentDaoImpl extends AbstractDao implements CommentDao {
    public CommentDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Comment create(Comment entity) {
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
            throw new RuntimeException("Can't create comment for: " + entity.getContent(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return entity;
    }

    @Override
    public Comment get(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(Comment.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get comment by ID: " + id, e);
        }
    }

    @Override
    public List<Comment> getAll() {
//        try (Session session = factory.openSession()) {
//            Query<Comment> allComments = session.createQuery(
//                    "FROM Comment ", Comment.class);
//            return allComments.getResultList();
//        } catch (Exception e) {
//            throw new RuntimeException("Can't get all comments, ", e);
//        }
        return null;
    }

    @Override
    public void remove(Comment entity) {
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
            throw new RuntimeException("Can't remove comment for: " + entity.getContent(), e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
