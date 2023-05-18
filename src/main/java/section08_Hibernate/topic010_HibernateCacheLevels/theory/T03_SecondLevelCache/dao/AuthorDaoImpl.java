package section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.dao;

import section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.model.Author;
import java.util.List;
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
        }
    }

    @Override
    public List<Author> getAll() {
        return factory.openSession()
                .createQuery("SELECT DISTINCT a "
                        + "FROM Author a LEFT JOIN FETCH a.books", Author.class)
                .getResultList();
    }
}
