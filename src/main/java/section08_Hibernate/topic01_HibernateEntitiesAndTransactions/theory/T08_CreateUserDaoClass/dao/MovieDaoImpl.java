package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.model.Movie;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.util.HibernateUtil;

public class MovieDaoImpl implements MovieDao {
    @Override
    public Movie save(Movie movie) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(movie);
        transaction.commit();
        session.close();
        return movie;
    }

    @Override
    public Movie get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.get(Movie.class, id);
    }
}
