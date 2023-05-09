package section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao.impl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao.MovieSessionDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.exception.DataProcessingException;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.lib.Dao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.model.MovieSession;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class MovieSessionDaoImpl implements MovieSessionDao {
    @Override
    public MovieSession add(MovieSession movieSession) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(movieSession);
            transaction.commit();
            return movieSession;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert movie session " + movieSession, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<MovieSession> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.get(MovieSession.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get a movie session by id: " + id, e);
        }
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<MovieSession> getMovieSessionQuery = session.createQuery(
                    "FROM MovieSession ms "
                            + "WHERE ms.movie.id = :movieId "
                            + "AND ms.showTime >= :start_of_day "
                            + "AND ms.showTime <= :end_of_day", MovieSession.class);
            getMovieSessionQuery.setParameter("movieId", movieId);
            getMovieSessionQuery.setParameter("start_of_day", date.atTime(LocalTime.MIN));
            getMovieSessionQuery.setParameter("end_of_day", date.atTime(LocalTime.MAX));
            return getMovieSessionQuery.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't find avaible session by movie id: "
                    + movieId + ", and date: " + date, e);
        }
    }
}
