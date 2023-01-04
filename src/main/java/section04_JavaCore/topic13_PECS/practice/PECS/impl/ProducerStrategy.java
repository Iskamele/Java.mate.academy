package section04_JavaCore.topic13_PECS.practice.PECS.impl;

import section04_JavaCore.topic13_PECS.practice.PECS.model.Bulldozer;
import section04_JavaCore.topic13_PECS.practice.PECS.model.Excavator;
import section04_JavaCore.topic13_PECS.practice.PECS.model.Machine;
import section04_JavaCore.topic13_PECS.practice.PECS.model.Truck;
import section04_JavaCore.topic13_PECS.practice.PECS.service.MachineProducer;
import java.util.HashMap;
import java.util.Map;

public class ProducerStrategy {
    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>>
            producers = new HashMap<>();

    public ProducerStrategy() {
        producers.put(Bulldozer.class, new BulldozerProducer());
        producers.put(Excavator.class, new ExcavatorProducer());
        producers.put(Truck.class, new TruckProducer());
    }

    public MachineProducer<? extends Machine> getProducer(Class<? extends Machine> type) {
        return producers.get(type);
    }
}
