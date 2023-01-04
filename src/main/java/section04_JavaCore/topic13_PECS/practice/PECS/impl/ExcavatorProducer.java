package section04_JavaCore.topic13_PECS.practice.PECS.impl;

import section04_JavaCore.topic13_PECS.practice.PECS.model.ColorSupplier;
import section04_JavaCore.topic13_PECS.practice.PECS.model.Excavator;
import section04_JavaCore.topic13_PECS.practice.PECS.model.ModelSupplier;
import section04_JavaCore.topic13_PECS.practice.PECS.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final ModelSupplier modelSupplier = new ModelSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            excavatorList.add(new Excavator(
                    modelSupplier.getRandomModel(),
                    colorSupplier.getRandomColor()));
        }
        return excavatorList;
    }
}
