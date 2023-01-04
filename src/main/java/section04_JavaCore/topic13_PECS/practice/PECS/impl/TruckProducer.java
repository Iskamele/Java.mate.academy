package section04_JavaCore.topic13_PECS.practice.PECS.impl;

import section04_JavaCore.topic13_PECS.practice.PECS.model.ColorSupplier;
import section04_JavaCore.topic13_PECS.practice.PECS.model.ModelSupplier;
import section04_JavaCore.topic13_PECS.practice.PECS.model.Truck;
import section04_JavaCore.topic13_PECS.practice.PECS.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private final ModelSupplier modelSupplier = new ModelSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Truck> get() {
        List<Truck> truckList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            truckList.add(new Truck(
                    modelSupplier.getRandomModel(),
                    colorSupplier.getRandomColor()));
        }
        return truckList;
    }
}
