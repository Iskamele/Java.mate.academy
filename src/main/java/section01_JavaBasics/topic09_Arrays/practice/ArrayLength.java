package section01_JavaBasics.topic09_Arrays.practice;

public class ArrayLength {
    public static void main(String[] args) {
        //  В Java массивы передаются по ссылке.
        String[] names = {"Bob", "Alice", "John"};
        System.out.println(returnArrayLength(names));
    }
    public static int returnArrayLength(String[] input) {
        return input.length;
    }
}
