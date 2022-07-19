package section01_JavaBasics.topic04_Methods;

public class DeclarationVsInvocation {
    public static void main(String[] args) {
        // Вызов метода
        int result = sum(10, 20);
        System.out.println(result);
    }

    public static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
