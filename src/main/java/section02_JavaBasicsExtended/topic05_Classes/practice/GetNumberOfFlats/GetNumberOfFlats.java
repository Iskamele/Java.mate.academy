package section02_JavaBasicsExtended.topic05_Classes.practice.GetNumberOfFlats;

public class GetNumberOfFlats {
    public static int getNumberOfFlats(Building[] buildingsInfo) {
        int result = 0;

        for (Building build : buildingsInfo) {
            result += build.numberOfFloors * build.flatsOnTheFloor;
        }

        return result;
    }
}
