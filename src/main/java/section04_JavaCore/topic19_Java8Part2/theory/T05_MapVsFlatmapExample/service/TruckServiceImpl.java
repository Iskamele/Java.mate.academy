package section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.service;

import section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.model.Truck;
import section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.model.Wheel;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TruckServiceImpl implements TruckService {
    @Override
    public List<String> getEngineModels(List<Truck> trucks) {
        return trucks.stream()
                .map(t -> t.getEngine().getModel())
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getWheelMakers(List<Truck> trucks) {
        return trucks.stream()
                .map(Truck::getWheels)
                .flatMap(Collection::stream)
                .map(Wheel::getMaker)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
