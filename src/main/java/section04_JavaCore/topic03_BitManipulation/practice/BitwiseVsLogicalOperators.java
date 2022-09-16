package section04_JavaCore.topic03_BitManipulation.practice;

public class BitwiseVsLogicalOperators {
    public static void main(String[] args) {
        System.out.println(executeExpression(2, 2));
        System.out.println(executeExpression(5, 4));
        System.out.println(executeExpression(0, 2));
        System.out.println(executeExpression(0, 4));
    }

    private static boolean executeExpression(int a, int b) {
        return (a != 0) && (b / 2 == 2);
    }
}
