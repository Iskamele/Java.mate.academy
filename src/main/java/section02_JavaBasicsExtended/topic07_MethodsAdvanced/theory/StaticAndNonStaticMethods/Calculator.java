package section02_JavaBasicsExtended.topic07_MethodsAdvanced.theory.StaticAndNonStaticMethods;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }
}
