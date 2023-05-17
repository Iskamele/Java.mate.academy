package section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.MPS;

import java.math.BigDecimal;
import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.MPS.dao.MachineDao;
import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.MPS.dao.impl.MachineDaoImpl;
import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.MPS.model.ElectricCar;
import section08_Hibernate.topic09_HibernateInheritance.theory.T01_InheritanceStrategiesOverview.MPS.model.RacingCar;

public class Main {

    public static void main(String[] args) {
        MachineDao machineDao = new MachineDaoImpl();
        // save machine
//        Machine volvoTruck = new Machine();
//        volvoTruck.setName("Volvo Truck");
//        volvoTruck.setPrice(BigDecimal.valueOf(55999));
//        machineDao.save(volvoTruck);

        ElectricCar tesla = new ElectricCar("Tesla", BigDecimal.valueOf(31999), 0.98);
        RacingCar ferrari = new RacingCar("Ferrari", BigDecimal.valueOf(87999), 500);
        machineDao.save(tesla);
        machineDao.save(ferrari);
    }
}
