package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.katrevichdv.model.Machine;

import java.util.List;

public interface MachineProducer<T extends Machine> {
    /**
     * In your implementations - create 2-3 models, add them to the list and return
     * @return - the list of models
     */
    List<T> get();
}