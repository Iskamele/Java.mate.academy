package section04_JavaCore.topic03_BitManipulation.practice;

public class BooleanExpression {
    public static void main(String[] args) {
        System.out.println(false == booleanExpression(true, false, false, false));   // false
        System.out.println(true == booleanExpression(true, true, false, false));     // true
        System.out.println(true == booleanExpression(true, false, true, false));     // true
        System.out.println(true == booleanExpression(true, false, false, true));     // true
        System.out.println(false == booleanExpression(false, true, false, false));   // false
        System.out.println(true == booleanExpression(false, true, true, false));     // true
        System.out.println(true == booleanExpression(false, true, false, true));     // true
        System.out.println(false == booleanExpression(false, false, true, false));   // false
        System.out.println(true == booleanExpression(false, false, true, true));     // true
        System.out.println(false == booleanExpression(true, true, true, false));     // false
        System.out.println(false == booleanExpression(false, true, true, true));     // false
        System.out.println(false == booleanExpression(true, false, true, true));     // false
        System.out.println(false == booleanExpression(true, true, true, true));      // false
        System.out.println(false == booleanExpression(false, false, false, false));  // false


    }

    private static boolean booleanExpression(boolean a, boolean b, boolean d, boolean c) {
        //return (a ^ b ^ c ^ d) ^ (a | b | c | d);
        //return (a & b & c & d) ? (a ^ b ^ c ^ d) : (a ^ b ^ c ^ d) ^ (a | b | c | d);
        //return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d)) | ((a ^ d) & (b ^ c));
        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d));
    }
}
