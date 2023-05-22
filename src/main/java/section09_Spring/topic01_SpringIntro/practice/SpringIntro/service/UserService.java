package section09_Spring.topic01_SpringIntro.practice.SpringIntro.service;

import java.util.List;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.model.User;

public interface UserService {
    User add(User user);

    List<User> getAll();
}
