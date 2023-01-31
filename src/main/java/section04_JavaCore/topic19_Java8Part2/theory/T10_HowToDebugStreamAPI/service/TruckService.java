package section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.service;

import section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.model.Truck;
import java.util.List;

public interface TruckService {
    List<String> getWheelMakers(List<Truck> trucks);
}
