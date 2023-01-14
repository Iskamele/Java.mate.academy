package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer("Caterpillar", "White", 3));
        list.add(new Bulldozer("Komatsu", "Yellow", 3));
        list.add(new Bulldozer("Liebherr", "Grey", 4));
        return list;
    }
}