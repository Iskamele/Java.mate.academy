package section04_JavaCore.topic13_PECS.theory.T03_PECSProducerExtends;

import section04_JavaCore.topic13_PECS.theory.T03_PECSProducerExtends.model.CargoPlane;
import section04_JavaCore.topic13_PECS.theory.T03_PECSProducerExtends.model.MilitaryPlane;
import section04_JavaCore.topic13_PECS.theory.T03_PECSProducerExtends.model.PassengerPlane;
import section04_JavaCore.topic13_PECS.theory.T03_PECSProducerExtends.model.Plane;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // PECS - Producer Extends Consumer Super
        MilitaryPlane militaryPlane1 = new MilitaryPlane("Military Boeing 1", "A123");
        MilitaryPlane militaryPlane2 = new MilitaryPlane("Military Boeing 2", "A124");
        MilitaryPlane militaryPlane3 = new MilitaryPlane("Military Boeing 3", "A125");

        militaryPlane1.setCountry("Ukraine");
        militaryPlane2.setCountry("USA");
        militaryPlane3.setCountry("France");

        CargoPlane cargoPlane1 = new CargoPlane("Cargo plane 1", "C111", 2018);
        CargoPlane cargoPlane2 = new CargoPlane("Cargo plane 2", "C222", 2019);
        CargoPlane cargoPlane3 = new CargoPlane("Cargo plane 3", "C333", 2020);

        cargoPlane1.setMaxWeight(100.0);
        cargoPlane2.setMaxWeight(150.0);
        cargoPlane3.setMaxWeight(190.0);

        PassengerPlane passengerPlane1 = new PassengerPlane("Passenger plane 1", "P321", 2008);
        PassengerPlane passengerPlane2 = new PassengerPlane("Passenger plane 2", "P421", 2009);
        PassengerPlane passengerPlane3 = new PassengerPlane("Passenger plane 3", "P521", 2010);

        passengerPlane1.setCapacity(77);
        passengerPlane2.setCapacity(129);
        passengerPlane3.setCapacity(266);

        List<MilitaryPlane> militaryPlanes = List.of(militaryPlane1, militaryPlane2, militaryPlane3);
        List<CargoPlane> cargoPlanes = List.of(cargoPlane1, cargoPlane2, cargoPlane3);
        List<PassengerPlane> passengerPlanes = List.of(passengerPlane1, passengerPlane2, passengerPlane3);

        getAverageYear(militaryPlanes);
        getAverageYear(cargoPlanes);
        getAverageYear(passengerPlanes);

        // Мы не можем передать в getAverageYear параметром militaryPlanes,
        // поскольку дженерики по своей сути являются инвариантными, а следовательно
        // список наших подтипов != список типов:
        // invariant List<SubType> ! = List<Type>
        // invariant List<MilitaryPlane> ! = List<Plane>

        // Нам необходимо достичь условия конвариантности:
        // covariant List<SubType> == List<Type>
        // А для этого понадобится использоваться принцип PECS
    }

    public static double getAverageYear(List<? extends Plane> planes) {
        if (planes.isEmpty()) {
            return 0;
        }
        int yearsSum = 0;
        for (Plane plane : planes) {
            yearsSum += plane.getYear();
        }
        return (double) yearsSum / planes.size();
    }
}
