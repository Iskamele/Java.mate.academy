package section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing;

import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.dao.UserDao;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.dao.UserDaoImpl;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.model.User;
import section08_Hibernate.topic06_TransactionIsolationLevels.theory.T01_PasswordHashing.util.HashUtil;

public class Main {

    public static void main(String[] args) {
        // create users

        User bob = new User();
        bob.setLogin("Bob");
        bob.setSalt(HashUtil.getSalt());
        bob.setPassword(HashUtil.hashPassword("qwerty", bob.getSalt()));;

        User alice = new User();
        alice.setLogin("Alice");
        alice.setSalt(HashUtil.getSalt());
        alice.setPassword("123456");;

        User john = new User();
        john.setLogin("John");
        john.setSalt(HashUtil.getSalt());
        john.setPassword("helloworld");

        // save users
        UserDao userDao = new UserDaoImpl();
        //userDao.save(bob);
        userDao.save(alice);
        userDao.save(john);
    }
}
