package section04_JavaCore.topic06_Exceptions.practice.master.UserScore;

public class Main {
    public static void main(String[] args) {
                String[] records = {"testEmail@gmail.com:100",
                "user@yahoo.com:1",
                "second-user@gmail.com:20"};
        String email = "second-user@gmail.com";
        UserService userService = new UserService();
        System.out.println(userService.getUserScore(records, email));
    }
}
