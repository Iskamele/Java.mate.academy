package section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.service;

import section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.model.Truck;
import section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.model.Wheel;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TruckServiceImpl implements TruckService {
    @Override
    public List<String> getWheelMakers(List<Truck> trucks) {
        return trucks.stream()
                .map(Truck::getWheels)
                .flatMap(Collection::stream)
                .map(Wheel::getMaker)
                //.peek(System.out::println)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
