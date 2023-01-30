package section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.service;

import section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.model.Truck;
import java.util.List;

public interface TruckService {
    List<String> getEngineModels(List<Truck> trucks);
    List<String> getWheelMakers(List<Truck> trucks);
}
