package section04_JavaCore.topic13_PECS.practice.PECS.impl;

import section04_JavaCore.topic13_PECS.practice.PECS.model.Bulldozer;
import section04_JavaCore.topic13_PECS.practice.PECS.model.ColorSupplier;
import section04_JavaCore.topic13_PECS.practice.PECS.model.ModelSupplier;
import section04_JavaCore.topic13_PECS.practice.PECS.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final ModelSupplier modelSupplier = new ModelSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bulldozerList.add(new Bulldozer(
                    modelSupplier.getRandomModel(),
                    colorSupplier.getRandomColor()));
        }
        return bulldozerList;
    }
}
