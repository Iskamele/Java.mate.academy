package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model.Excavator;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator("Caterpillar", "White", 10));
        list.add(new Excavator("Daewoo", "Blue", 9));
        list.add(new Excavator("John Deere", "Green", 8));
        return list;
    }
}