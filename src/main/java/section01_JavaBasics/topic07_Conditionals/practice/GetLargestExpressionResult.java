package section01_JavaBasics.topic07_Conditionals.practice;

public class GetLargestExpressionResult {
    public static void main(String[] args) {
        System.out.println(getResult(10, -5));
        System.out.println(getResult(5, -3));
        System.out.println(getResult(-5, -3));
        System.out.println(getResult(-5, -4.5));
    }
    public static double getResult(double a, double b) {
        double sum = a + b;
        double sub = a - b;
        double mult = a * b;
        double div = a / b;
        double answer = sum;
        if (sub > answer) {
            answer = sub;
        }
        if (mult > answer){
            answer = mult;
        }
        if (div > answer) {
            answer = div;
        }
        return answer;
    }
}
