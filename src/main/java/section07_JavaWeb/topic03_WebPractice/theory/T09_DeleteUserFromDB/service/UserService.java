package section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T09_DeleteUserFromDB.model.User;

public interface UserService {
    List<User> getAll();

    void delete(Long id);
}
