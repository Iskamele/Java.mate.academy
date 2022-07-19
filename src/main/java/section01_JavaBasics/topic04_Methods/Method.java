package section01_JavaBasics.topic04_Methods;

public class Method {
    public static void main(String[] args) {
        // Rectangle 5 x 8
        printRectangleInfo(5, 8);
        // Rectangle 3 x 10
        printRectangleInfo(3, 10);
    }

    public static void printRectangleInfo(int a, int b) {

        int perimeter1 = 2 * a + 2 * b;
        int square1 = a * b;

        System.out.println("Rectangle " + a + " x " + b);
        System.out.println("Perimeter is " + perimeter1);
        System.out.println("Square is " + square1);
        System.out.println("------------------");
    }
}
