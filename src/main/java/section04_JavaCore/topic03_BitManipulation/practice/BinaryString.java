package section04_JavaCore.topic03_BitManipulation.practice;

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
        StringBuilder builder = new StringBuilder();
        int countFor = value;

        for (int i = 0; i < countFor && value != 0; i++) {
            builder.append(value % 2);
            value /= 2;
        }
        return countFor != 0 ? builder.reverse().toString() : "0";
    }
}
