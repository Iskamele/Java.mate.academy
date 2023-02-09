package section04_JavaCore.topic20_StreamAPIPractice.practice.CarModels;

import java.util.List;
import java.util.stream.Collectors;

public class CarModels {
    private static final int AFTER_YEAR = 1955;

    public static List<String> getCarModels(List<Car> cars) {
        return cars.stream()
                .filter(car -> car.getYear() > AFTER_YEAR)
                .map(Car::getModel)
                .collect(Collectors.toList());
    }
}
