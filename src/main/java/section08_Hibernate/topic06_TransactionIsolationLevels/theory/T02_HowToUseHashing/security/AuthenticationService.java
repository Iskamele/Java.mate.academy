package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.security;

import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T02_HowToUseHashing.model.User;

public interface AuthenticationService {
    void register(String login, String password);

    User login(String login, String password);
}
