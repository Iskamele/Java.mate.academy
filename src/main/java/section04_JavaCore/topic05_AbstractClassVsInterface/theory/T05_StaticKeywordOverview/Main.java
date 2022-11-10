package section04_JavaCore.topic05_AbstractClassVsInterface.theory.T05_StaticKeywordOverview;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        User alice = new User();

        bob.name = "Bob";
        alice.name = "Alice";

        System.out.println(bob);
        System.out.println(alice);
    }
}
