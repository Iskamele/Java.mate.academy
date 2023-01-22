package section04_JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.service;

import section04_JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> findByAgeGreaterThat(List<User> users, int age) {
        List<User> result = new ArrayList<>();
        for (User user : users) {
            if (user.getAge() > age) {
                result.add(user);
            }
        }
        return result;
    }
}
