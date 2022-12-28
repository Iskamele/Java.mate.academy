package section04_JavaCore.topic13_PECS.theory.T04_PECSConsumerSuper;

import section04_JavaCore.topic13_PECS.theory.T04_PECSConsumerSuper.model.CargoPlane;
import section04_JavaCore.topic13_PECS.theory.T04_PECSConsumerSuper.model.Plane;

import java.util.ArrayList;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<CargoPlane> cargoPlanes = getCargoPlanes();
        List<Plane> planes = getPlanes();

        CargoPlane cargoPlane = new CargoPlane("Airbus", "A328");

        // implement method fill, that will fill the list with a passed value
        fillCargo(cargoPlanes, cargoPlane);
        fillCargo(planes, cargoPlane);

        List<? super CargoPlane> superPlanes = new ArrayList<>();
        //List<CargoPlane> superPlanes = new ArrayList<>();
        superPlanes.add(new CargoPlane());
        superPlanes.add(new CargoPlane());
    }

    private static void fillCargo(List<? super CargoPlane> planes, CargoPlane plane) {
        int size = planes.size();
        for (int i = 0; i < size; i++) {
            planes.add(i, plane);
        }
    }

    private static List<CargoPlane> getCargoPlanes() {
        List<CargoPlane> cargoPlanes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cargoPlanes.add(null);
        }
        return cargoPlanes;
    }

    private static List<Plane> getPlanes() {
        List<Plane> cargoPlanes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cargoPlanes.add(null);
        }
        return cargoPlanes;
    }
}
