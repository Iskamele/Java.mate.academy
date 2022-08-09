package section02_JavaBasicsExtended.topic07_MethodsAdvanced.theory.StaticAndNonStaticMethods;

public class Main {
    public static void main(String[] args) {
        // static methods

        // create a calculator class

        Calculator calculator = new Calculator(10, 15);
        int sum = calculator.getSum();

        int staticSum = StaticCalculator.getSum(20, 25);
        System.out.println(staticSum);

        int i = Integer.parseInt("15");
    }
}
