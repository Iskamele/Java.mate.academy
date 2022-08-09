package section02_JavaBasicsExtended.topic07_MethodsAdvanced.theory.MethodOverloading;

public class Main {
    public static void main(String[] args) {
        // method overloading

        Calculator calculator = new Calculator();
        int sum = calculator.getSum(10, 15);

        int threeElementSum = calculator.getSum(10, 15, 25);

        int doubleSum = calculator.getSum(1.1, 2.2);

        System.out.println(sum);
        System.out.println(threeElementSum);
        System.out.println(doubleSum);

        StringBuilder builder = new StringBuilder();
        builder.append(1); // append - классический пример method overloading
    }
}
