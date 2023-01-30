package section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap;

import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.Car;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.User;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.service.AdvertisementService;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.service.AdvertisementServiceImpl;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // There is a list of advertisements
        // Return the Map<User, List<Car>>
        // where key is a user that create the advertisement
        // and value is a List of cars manufactured after 2015


        AdvertisementService advertisementService = new AdvertisementServiceImpl();
        Map<User, List<Car>> allYearGreaterThan = advertisementService.getAllYearGreaterThan(2015);
        allYearGreaterThan.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
