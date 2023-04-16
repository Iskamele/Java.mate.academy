package section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.dao;

import java.util.Optional;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.model.User;

public interface UserDao {
    Optional<User> findByUsername(String username);
}
