package section01_JavaBasics.topic09_Arrays;

public class HowToCreateANewEmptyArray {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i+1) *10;
        }

        String[] array = new String[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
