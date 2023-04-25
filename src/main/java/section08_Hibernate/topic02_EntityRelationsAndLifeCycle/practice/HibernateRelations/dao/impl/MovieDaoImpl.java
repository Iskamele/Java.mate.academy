package section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.impl;

import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.dao.MovieDao;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.exception.DataProcessingException;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.practice.HibernateRelations.model.Movie;

public class MovieDaoImpl extends AbstractDao implements MovieDao {

    public MovieDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't add movie to DB for : " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return movie;
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = factory.openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get movie by ID: " + id, e);
        }
    }
}
