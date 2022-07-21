package section01_JavaBasics.topic09_Arrays.practice;

public class IndexOutOfBoundExceptionExample {
    public static void main(String[] args) {
    }

    public static String[] createArray() {
        String[] fruits = new String[3];
        fruits[2] = "lemon";

        return fruits;
    }
}