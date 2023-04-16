package section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.service;

import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.exception.AuthenticationException;
import section07_JavaWeb.topic04_SecurityInWeb.theory.T05_WhatIsFilter.model.User;

public interface AuthenticationService {
    User login(String username, String password) throws AuthenticationException;
}
