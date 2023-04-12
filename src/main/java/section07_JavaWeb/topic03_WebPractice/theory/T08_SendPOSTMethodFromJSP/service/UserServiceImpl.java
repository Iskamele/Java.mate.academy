package section07_JavaWeb.topic03_WebPractice.theory.T08_SendPOSTMethodFromJSP.service;

import section07_JavaWeb.topic03_WebPractice.theory.T08_SendPOSTMethodFromJSP.model.User;

public class UserServiceImpl implements UserService {
    @Override
    public void register(String username, String password, String repeatPassword) {
        if (!password.equals(repeatPassword)) {
            throw new RuntimeException("Can't register user.");
        }
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        //userdao.save(user);
    }
}
