package section01_JavaBasics.topic11_Practice.slack;

public class HelpInSlack2 {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, true, false, false));    // true
        System.out.println(booleanExpression(true, false, true, false));    // true
        System.out.println(booleanExpression(true, false, false, true));    // true
        System.out.println(booleanExpression(true, false, false, false));   // false
        System.out.println(booleanExpression(false, true, false, false));   // false
        System.out.println(booleanExpression(false, false, true, false));   // false
        System.out.println(booleanExpression(false, false, false, true));   // false
        System.out.println(booleanExpression(true, true, true, false));     // false
        System.out.println(booleanExpression(false, false, false, false));  // false
        System.out.println(booleanExpression(false, true, false, true));    // true
        System.out.println(booleanExpression(true, true, true, true));      // false
    }
    public static boolean booleanExpression (boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b ^ c ^ d) ^ (a || b || c || d);
    }
}
