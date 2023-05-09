package section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao.impl;

import java.util.List;
import java.util.Optional;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.dao.CinemaHallDao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.exception.DataProcessingException;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.lib.Dao;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.model.CinemaHall;
import section08_Hibernate.topic04_WorkingWithLazyInitialization.practice.HibernateCreateMovieSession.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

@Dao
public class CinemaHallDaoImpl implements CinemaHallDao {
    @Override
    public CinemaHall add(CinemaHall cinemaHall) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(cinemaHall);
            transaction.commit();
            return cinemaHall;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DataProcessingException("Can't insert cinema hall " + cinemaHall, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Optional<CinemaHall> get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.get(CinemaHall.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get a cinema hall by id: " + id, e);
        }
    }

    @Override
    public List<CinemaHall> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<CinemaHall> getAllMovieQuery = session.createQuery(
                    "FROM CinemaHall", CinemaHall.class);
            return getAllMovieQuery.getResultList();
        } catch (Exception e) {
            throw new DataProcessingException("Can't get all cinema halls.", e);
        }
    }
}
