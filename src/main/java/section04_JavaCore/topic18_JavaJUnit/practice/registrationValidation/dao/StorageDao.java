package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.dao;

import core.basesyntax.model.User;

public interface StorageDao {
    User add(User user);

    User get(String login);
}
