package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.figure;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.AbstractDao;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.figure.Figure;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class FigureDaoImpl<T extends Figure> extends AbstractDao implements FigureDao<T> {
    public FigureDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public T save(T figure) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(figure);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't save figure to DB: " + figure, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return figure;
    }

    @Override
    public List<T> findByColor(String color, Class<T> clazz) {
        try (Session session = sessionFactory.openSession()) {
            String className = clazz.getSimpleName();
            Query<T> query = session.createQuery("FROM " + className + " f "
                    + "WHERE f.color LIKE :color");
            query.setParameter("color", color);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Can't find " + clazz.getSimpleName()
                    + " by color: " + color, e);
        }
    }
}
