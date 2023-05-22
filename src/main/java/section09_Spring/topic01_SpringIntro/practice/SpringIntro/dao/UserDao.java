package section09_Spring.topic01_SpringIntro.practice.SpringIntro.dao;

import java.util.List;
import section09_Spring.topic01_SpringIntro.practice.SpringIntro.model.User;

public interface UserDao {
    User add(User user);

    List<User> getAll();
}
