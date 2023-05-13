package section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.dao;

import java.util.List;
import section08_Hibernate.topic07_N1Problem.theory.T02_NProblem.model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AuthorDaoImpl extends AbstractDao implements AuthorDao {
    public AuthorDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Author save(Author author) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.persist(author);
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException("Can't save author: " + author, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return author;
    }

    @Override
    public Author get(Long id) {
        try (Session session = factory.openSession()) {
            return session.get(Author.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Can't get author details by ID: " + id, e);
        }
    }

    @Override
    public List<Author> getAll() {
        return factory.openSession()
                //.createQuery("FROM Author", Author.class)
                .createQuery("SELECT DISTINCT a FROM Author a LEFT JOIN FETCH a.books", Author.class)
                .getResultList();
    }
}
