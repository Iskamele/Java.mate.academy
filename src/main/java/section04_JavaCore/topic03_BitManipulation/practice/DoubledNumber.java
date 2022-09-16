package section04_JavaCore.topic03_BitManipulation.practice;

public class DoubledNumber {
    public static void main(String[] args) {
        System.out.println(getDoubledNumber(-2));
        System.out.println(getDoubledNumber(3));
        System.out.println(getDoubledNumber(10));
    }

    public static int getDoubledNumber(int number) {
        return number << 1;
    }
}
