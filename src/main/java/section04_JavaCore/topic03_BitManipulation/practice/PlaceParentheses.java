package section04_JavaCore.topic03_BitManipulation.practice;

public class PlaceParentheses {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        System.out.println(isFalse(a, b, c, d));
    }

    private static boolean isFalse(boolean a, boolean b, boolean c, boolean d) {
        /*
    Because of higher priority of '&&' we should split our expression
    on two parts 'a && b' and 'c && !d || a', so we could deal only with one at the same time.
    In this case the left part will return false anyway,
    so we have to get false on the right side too.
    For this purpose we should place parentheses on the right side
    of our expression somewhere. We have two options, place them around
    'c && !d' or around '!d || a'.
    The first option is not suitable because it will return true to us,
    but the second one will return false, so the final of expression you can see below.
  */
        return a && b || c && (!d || a);
    }
}
