package section04_JavaCore.topic04_OOP.JAVARUSH;

public class Main {
    public static void main(String[] args) {
        AbstractPhone firstPhone = new ThomasEdisonPhone(1989);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone = new VideoPhone(2018);

        User user = new User("Bob");

        user.callAnotherUser(224467, firstPhone);
        System.out.println();
        user.callAnotherUser(224467, phone);
        System.out.println();
        user.callAnotherUser(224467, videoPhone);
    }
}
