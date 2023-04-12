package section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.dao;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.model.User;

public interface UserDao {
    List<User> getAll();
}
