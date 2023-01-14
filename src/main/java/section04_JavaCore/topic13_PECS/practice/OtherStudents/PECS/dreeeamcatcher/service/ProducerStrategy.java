package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model.Bulldozer;
import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model.Excavator;
import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model.Machine;
import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model.Truck;
import java.util.HashMap;
import java.util.Map;

public class ProducerStrategy {
    private final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Truck> truckProducer = new TruckProducer();
    private Map<Class<? extends Machine>, MachineProducer<? extends Machine>> map = new HashMap<>();

    {
        map.put(Bulldozer.class, bulldozerProducer);
        map.put(Excavator.class, excavatorProducer);
        map.put(Truck.class, truckProducer);
    }

    public MachineProducer<? extends Machine> getMachineProducer(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer = map.get(type);
        if (machineProducer == null) {
            throw new RuntimeException("Got invalid class for producer. Please, input valid class");
        }
        return machineProducer;
    }
}