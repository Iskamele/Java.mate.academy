package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.dao;

import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.model.User;

public interface StorageDao {
    User add(User user);

    User get(String login);
}
