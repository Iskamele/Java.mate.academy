package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.machine;

import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.machine.Machine;
import java.util.List;

public interface MachineDao {
    Machine save(Machine machine);

    List<Machine> findByAgeOlderThan(int age);
}
