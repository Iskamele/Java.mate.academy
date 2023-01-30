package section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.service;

import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.Car;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.User;
import java.util.List;
import java.util.Map;

public interface AdvertisementService {
    Map<User, List<Car>> getAllYearGreaterThan(int year);
}
