package section01_JavaBasics.topic04_Methods.theory;

public class MethodPractice {
    public static void main(String[] args) {
        boolean isNumberEven = isEven(5);
        System.out.println(isNumberEven);

        sayHello();
    }

    // Название метода должно отображать то, что он делает
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void sayHello(){
        System.out.println("Hello, mates!");
    }
}
