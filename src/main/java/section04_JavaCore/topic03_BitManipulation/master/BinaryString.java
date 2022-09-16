package section04_JavaCore.topic03_BitManipulation.master;

public class BinaryString {
    public static void main(String[] args) {
        System.out.println(toBinaryString(0));
        System.out.println(toBinaryString(1));
        System.out.println(toBinaryString(2));
        System.out.println(toBinaryString(3));
        System.out.println(toBinaryString(4));
        System.out.println(toBinaryString(5));
    }

    private static String toBinaryString(int value) {
        if (value == 0) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        while (value > 0) {
            builder.append(value % 2);
            value = value / 2;
        }
        return builder.reverse().toString();
    }
}