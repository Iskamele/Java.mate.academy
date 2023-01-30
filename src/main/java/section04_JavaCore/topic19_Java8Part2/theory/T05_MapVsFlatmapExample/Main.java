package section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample;

import section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.db.Storage;
import section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.service.TruckService;
import section04_JavaCore.topic19_Java8Part2.theory.T05_MapVsFlatmapExample.service.TruckServiceImpl;

public class Main {

    public static void main(String[] args) {
        TruckService truckService = new TruckServiceImpl();
        truckService.getEngineModels(Storage.getTrucks()).forEach(System.out::println);
        truckService.getWheelMakers(Storage.getTrucks()).forEach(System.out::println);
    }
}
