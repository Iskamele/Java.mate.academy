package section01_JavaBasics.topic09_Arrays.theory;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] numbers = {10, 11,12,13};
        String[] names = {"Bob", "Alice", "John"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("element by index " + i + " is "+ numbers[i]);
        }

        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.println("name by index " + i + " is " + names[i]);
        }
    }
}
