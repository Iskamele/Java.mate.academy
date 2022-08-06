package section02_JavaBasicsExtended.topic05_Classes.practice.GetNumberOfFlats;

import static section02_JavaBasicsExtended.topic05_Classes.practice.GetNumberOfFlats.GetNumberOfFlats.getNumberOfFlats;

public class Main {
    public static void main(String[] args) {
        Building firstBuilding = new Building();
        firstBuilding.id = 1;
        firstBuilding.numberOfFloors = 9;
        firstBuilding.flatsOnTheFloor = 15;

        Building secondBuilding = new Building();
        secondBuilding.id = 2;
        secondBuilding.numberOfFloors = 7;
        secondBuilding.flatsOnTheFloor = 5;


        Building thirdBuilding = new Building();
        thirdBuilding.id = 3;
        thirdBuilding.numberOfFloors = 5;
        thirdBuilding.flatsOnTheFloor = 10;

        Building[] array = {firstBuilding, secondBuilding, thirdBuilding};

        System.out.println(getNumberOfFlats(array));
    }
}
