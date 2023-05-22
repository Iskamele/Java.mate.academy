package section09_Spring.topic01_SpringIntro.practice.SpringIntro;

import section09_Spring.topic01_SpringIntro.practice.SpringIntro.model.User;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.service.UserService;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {
        // create users
        User bob = new User();
        bob.setName("Bob");
        bob.setAge(25);

        User alise = new User();
        alise.setName("Alise");
        alise.setAge(20);

        // add users
        UserService userService = context.getBean(UserService.class);

        userService.add(bob);
        userService.add(alise);

        // print users
        System.out.println(userService.getAll());
    }
}
