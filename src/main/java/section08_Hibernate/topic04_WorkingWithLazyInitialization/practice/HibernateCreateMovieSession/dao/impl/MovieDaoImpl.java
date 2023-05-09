package section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao.impl;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao.MovieDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.exception.DataProcessingException;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.lib.Dao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.model.Movie;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            return movie;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert movie " + movie, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<Movie> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get a movie by id: " + id, e);
        }
    }

    @Override
    public List<Movie> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<Movie> getAllMovieQuery = session.createQuery(
                    "FROM Movie", Movie.class);
            return getAllMovieQuery.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get all movies.", e);
        }
    }
}
