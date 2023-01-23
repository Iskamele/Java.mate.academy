package section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.dao;

import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.db.Storage;
import section04_JavaCore.topic18_JavaJUnit.practice.registrationValidation.model.User;

public class StorageDaoImpl implements StorageDao {
    private static Long index = 0L;

    @Override
    public User add(User user) {
        user.setId(++index);
        Storage.people.add(user);
        return user;
    }

    @Override
    public User get(String login) {
        for (User user : Storage.people) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}
