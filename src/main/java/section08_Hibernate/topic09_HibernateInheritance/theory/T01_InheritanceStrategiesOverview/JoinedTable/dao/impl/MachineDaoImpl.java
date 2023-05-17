package section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.dao.impl;

import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.dao.MachineDao;
import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.model.Machine;
import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MachineDaoImpl implements MachineDao {
    @Override
    public Machine save(Machine machine) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(machine);
            transaction.commit();
            return machine;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Can't insert machine " + machine, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Machine get(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.get(Machine.class, id);
        }
    }
}
