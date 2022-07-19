package section01_JavaBasics.topic04_Methods;

public class Return {
    public static void main(String[] args) {
        String smallHouse = buildHouse(2, "red");
        String bigHouse = buildHouse(9, "blue");

        System.out.println(smallHouse);
        System.out.println(bigHouse);
    }

    // Метод, который возвращает с помощью return
    public static String buildHouse(int numberOfFloors, String color) {
        //return color + " " + numberOfFloors + "-floors building";

        String house = color + " " + numberOfFloors + "-floors building";
        return house;
    }

    // Метод, который ничего не будет возвращать. Войдовский метод. Return можно не писать
    public static void printRectangleInfo(int a, int b){
        System.out.println("Rectangle");
        return;
    }
}