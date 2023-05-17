package section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.dao;

import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.JoinedTable.model.Machine;

public interface MachineDao {
    Machine save(Machine machine);

    Machine get(Long id);
}
