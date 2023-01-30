package section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.service;

import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.db.Storage;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.Advertisement;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.Car;
import section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model.User;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvertisementServiceImpl implements AdvertisementService {
    @Override
    public Map<User, List<Car>> getAllYearGreaterThan(int year) {
        return Storage.getAdvertisement()
                .stream()
                .filter(a -> a.getCar().getYear() >= year)
                .collect(Collectors.groupingBy(Advertisement::getOwner,
                        Collectors.mapping(Advertisement::getCar, Collectors.toList())));
    }
}
