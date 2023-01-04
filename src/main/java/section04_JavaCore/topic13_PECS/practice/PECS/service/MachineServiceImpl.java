package section04_JavaCore.topic13_PECS.practice.PECS.service;

import section04_JavaCore.topic13_PECS.practice.PECS.impl.ProducerStrategy;
import section04_JavaCore.topic13_PECS.practice.PECS.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final ProducerStrategy producerStrategy = new ProducerStrategy();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        try {
            List<? extends Machine> machines = producerStrategy.getProducer(type).get();
            return new ArrayList<>(machines);
        } catch (RuntimeException e) {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
