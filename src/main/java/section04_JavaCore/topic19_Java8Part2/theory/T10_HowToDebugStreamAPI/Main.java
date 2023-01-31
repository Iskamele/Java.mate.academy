package section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI;

import section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.db.Storage;
import section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.service.TruckService;
import section04_JavaCore.topic19_Java8Part2.theory.T10_HowToDebugStreamAPI.service.TruckServiceImpl;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Stream API: debug

        TruckService truckService = new TruckServiceImpl();
        List<String> wheelMakers = truckService.getWheelMakers(Storage.getTrucks());
    }
}
