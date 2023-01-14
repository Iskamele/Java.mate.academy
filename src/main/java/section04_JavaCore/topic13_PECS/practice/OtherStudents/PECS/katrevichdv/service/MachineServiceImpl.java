package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model.Bulldozer;
import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model.Excavator;
import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model.Machine;
import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model.Truck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private HashMap<Class<? extends Machine>,
            MachineProducer<? extends Machine>> producers = new HashMap<>();

    public MachineServiceImpl() {
        producers.put(Bulldozer.class, new BulldozerProducer());
        producers.put(Excavator.class, new ExcavatorProducer());
        producers.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = producers.get(type);
        List<? extends Machine> machines = producer == null ? new ArrayList<>() : producer.get();
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}