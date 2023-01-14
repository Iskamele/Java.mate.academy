package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> machines = new ArrayList<>();
        machines.add(new Bulldozer());
        machines.add(new Bulldozer());
        machines.add(new Bulldozer());
        return machines;
    }
}