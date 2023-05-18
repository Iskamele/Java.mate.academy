package Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.machine;

import Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.AbstractTest;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.machine.MachineDao;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.dao.machine.MachineDaoImpl;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.machine.Car;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.machine.Machine;
import section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.machine.Truck;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MachineDaoImplTest extends AbstractTest {
    private MachineDao machineDao;

    @Override
    protected Class<?>[] entities() {
        return new Class[]{
                Machine.class,
                Car.class,
                Truck.class
        };
    }

    @Before
    public void setUp() {
        machineDao = new MachineDaoImpl(getSessionFactory());
    }

    @Test
    public void createMachine_Ok() {
        Machine machine = new Machine();
        machine.setYear(2010);
        machine.setMaker("Cat");
        Machine actualMachine = machineDao.save(machine);
        Assert.assertNotNull(actualMachine);
        Assert.assertEquals(1L, actualMachine.getId().longValue());
    }

    @Test
    public void createTruck_Ok() {
        Truck truck = new Truck();
        truck.setMaker("Volvo");
        truck.setMaxAllowedWeight(1500);
        truck.setYear(2018);
        truck.setColor("Pink");
        Machine actualTruck = machineDao.save(truck);
        Assert.assertNotNull(actualTruck.getId());
        Assert.assertEquals(1L, actualTruck.getId().longValue());
    }

    @Test
    public void createCar_Ok() {
        Car car = new Car();
        car.setYear(2016);
        car.setMaker("Audi");
        car.setModel("A6");
        car.setHorsePower(300);
        Machine actualCar = machineDao.save(car);
        Assert.assertNotNull(actualCar.getId());
        Assert.assertEquals(1L, actualCar.getId().longValue());
    }

    @Test
    public void findByAgeOlderThan_Ok() {
        Machine machine = new Machine();
        int currentYear = LocalDate.now().getYear();
        machine.setYear(currentYear - 2);
        Car car = new Car();
        car.setYear(currentYear - 3);
        Truck truck = new Truck();
        truck.setYear(currentYear - 4);
        machineDao.save(car);
        machineDao.save(truck);
        machineDao.save(machine);
        Assert.assertEquals(2, machineDao.findByAgeOlderThan(2).size());
    }

    @Test
    public void findByAgeOlderThan_zeroMachines() {
        Machine machine = new Machine();
        int currentYear = LocalDate.now().getYear();
        machine.setYear(currentYear - 2);
        Car car = new Car();
        car.setYear(currentYear - 1);
        Truck truck = new Truck();
        truck.setYear(currentYear);
        machineDao.save(car);
        machineDao.save(truck);
        machineDao.save(machine);
        Assert.assertEquals(0, machineDao.findByAgeOlderThan(2).size());
    }
}
