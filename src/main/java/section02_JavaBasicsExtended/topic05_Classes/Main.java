package section02_JavaBasicsExtended.topic05_Classes;

import section02_JavaBasicsExtended.topic05_Classes.model.User;

public class Main {
    public static void main(String[] args) {
        // What is a class?

        // Task: find the users whose favorite topic is IT

        // Create a class User
        // Each user can have a name, age and favorite topic

        User bobUser = new User();
        bobUser.age = 24;
        bobUser.name = "Bob";
        bobUser.favoriteTopic = "IT";

        User aliceUser = new User();
        aliceUser.age = 23;
        aliceUser.name = "Alice";
        aliceUser.favoriteTopic = "Fantasy";

        User[] users = new User[] {bobUser, aliceUser};

        for (User user : users){
            if (user.favoriteTopic.equals("IT")){
                System.out.println(user.name);
            }
        }
    }
}
