package section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.service;

import java.util.List;
import section07_JavaWeb.topic03_WebPractice.theory.T03_JSPDisplayAListOfObjects.model.User;

public interface UserService {
    List<User> getAll();
}
