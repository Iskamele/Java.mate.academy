package section01_JavaBasics.topic06_Boolean.practice;

public class ComparisonOperators {
    public static void main(String[] args) {
        setBooleans(5,6);
    }
    public static void setBooleans(int a, int b) {
        boolean isEqual = a == b;
        boolean isNot = a != b;
        boolean isLess = a < b;
        boolean isGreater = a > b;
        boolean isLessOrEqual = a <= b;
        boolean isGreaterOrEqual = a >= b;
    }
}
