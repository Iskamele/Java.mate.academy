package section04_JavaCore.topic04_OOP.theory.Tenth_SuperInMethods;

public class Main {
    public static void main(String[] args) {
        // this vs super

        Cat billy = new Cat("Billy", 5, "Black");
        System.out.println(billy);

        System.out.println(billy.getInfo());
    }
}
