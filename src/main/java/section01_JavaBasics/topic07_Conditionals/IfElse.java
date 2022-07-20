package section01_JavaBasics.topic07_Conditionals;

public class IfElse {
    public static void main(String[] args) {
        int age = 10;

        if (age > 10) {
            System.out.println("Adult");
        } else if (age > 7) {
            System.out.println("Child");
        } else if (age > 3) {
            System.out.println("Toddler");
        } else {
            System.out.println("Baby");
        }
    }
}
