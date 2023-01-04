package section04_JavaCore.topic13_PECS.practice.PECS.service;

import section04_JavaCore.topic13_PECS.practice.PECS.model.Machine;
import java.util.List;

public interface MachineProducer<M extends Machine> {

    List<M> get();
}
