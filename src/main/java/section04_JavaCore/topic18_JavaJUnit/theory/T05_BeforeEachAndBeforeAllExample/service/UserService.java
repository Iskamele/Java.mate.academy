package section04_JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.service;

import section04_JavaCore.topic18_JavaJUnit.theory.T05_BeforeEachAndBeforeAllExample.model.User;

import java.util.List;

public interface UserService {
    List<User> findByAgeGreaterThat(List<User> users, int age);
}
