package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T05_AnnotationsOverview;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T04_ConfigureHibernate.model.Movie;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T04_ConfigureHibernate.util.HibernateUtil;

public class Main {
    // Configure Hibernate
    public static void main(String[] args) {
        // 1. Create Movie class
        // 2. Add required dependencies
        // 3. Add Hibernate configuration
        // 4. Save movie to the DB

        // SessionFactory
        // Session
        // Transaction

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Movie movie = new Movie();
        movie.setTitle("Fast and Furious 9");
        movie.setDescription("Awesome movie");
        session.save(movie);
        transaction.commit();
        session.close();
    }
}
