package section02_JavaBasicsExtended.topic07_MethodsAdvanced.theory.MethodOverloading;

public class Calculator {
    public int getSum(int a, int b) {
        return a + b;
    }

    public int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public int getSum(double x, double y) {
        return (int) (x + y);
    }

    public int getSum(int x, double y) {
        return (int) (x + y);
    }

    public int getSum(double x, int y) {
        return (int) (x + y);
    }
}
