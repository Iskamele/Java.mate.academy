package section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.service;

import section04_JavaCore.topic13_PECS.practice.OtherStudents.PECS.dreeeamcatcher.model.Machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final ProducerStrategy strategy = new ProducerStrategy();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        try {
            MachineProducer<? extends Machine> producer = strategy.getMachineProducer(type);
            List<? extends Machine> machines = producer.get();
            return new ArrayList<>(machines);
        } catch (RuntimeException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine: list) {
            machine.doWork();
        }
    }
}