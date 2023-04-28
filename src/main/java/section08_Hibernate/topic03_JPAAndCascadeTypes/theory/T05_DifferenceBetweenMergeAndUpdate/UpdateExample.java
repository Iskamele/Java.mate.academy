package section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T05_DifferenceBetweenMergeAndUpdate;

import java.math.BigDecimal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import section08_Hibernate.topic02_EntityRelationsAndLifeCycle.theory.T08_EntityStatesEntityLifeCycle.util.HibernateUtil;
import section08_Hibernate.topic03_JPAAndCascadeTypes.theory.T05_DifferenceBetweenMergeAndUpdate.model.Product;

public class UpdateExample {

    public static void main(String[] args) {
        Product iPhone = new Product();
        iPhone.setName("iPhone 13");
        iPhone.setPrice(BigDecimal.valueOf(1500));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        System.out.println("before save");
        session.save(iPhone);
        System.out.println("after save");
        System.out.println("before commit");
        transaction.commit();
        System.out.println("after commit");

        session.close();

        iPhone.setName("iPhone 7");
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        System.out.println("before update");
        session.update(iPhone);
        System.out.println("after update");
        System.out.println("before commit");
        transaction.commit();
        System.out.println("after commit");

        session.close();
    }
}
