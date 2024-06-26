package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.dao;

import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.exception.DataProcessingException;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.lib.Dao;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.model.Movie;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.practice.HibernateConfigurationHw.util.HibernateUtil;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Dao
public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie add(Movie movie) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
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
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Movie.class, id));
        } catch (Exception e) {
            throw new DataProcessingException("Can't get movie by ID: " + id, e);
        }
    }
}
