package section01_JavaBasics.topic07_Conditionals.practiceMaster;

public class GetLargestExpressionResult {
    public static void main(String[] args) {
        System.out.println(getResult(10, -5));
        System.out.println(getResult(5, -3));
        System.out.println(getResult(-5, -3));
        System.out.println(getResult(-5, -4.5));
    }

    public static double getResult(double a, double b) {
        double result = a + b;
        if ((a - b) > result) {
            result = a - b;
        }
        if ((a * b) > result) {
            result = a * b;
        }
        if ((a / b) > result) {
            result = a / b;
        }
        return result;
    }
}
