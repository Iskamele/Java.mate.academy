package section04_JavaCore.topic03_BitManipulation.theory;

public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 5; // 0101
        int b = 6; // 0110

        // Bitwise operations in Java

        // Bitwise OR |
        int or = a | b; // 0111
        System.out.println(or);

        // Bitwise AND &
        int and = a & b; // 0100
        System.out.println(and);

        // Bitwise XOR ^
        int xor = a ^ b; // 0011
        System.out.println(xor);

        // Bitwise Complement ~
        int complement = ~a; // 1010
        System.out.println(complement);
    }
}
