package section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship;

import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.dao.AddressDao;
import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.dao.AddressDaoImpl;
import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.dao.UserDaoImpl;
import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.dao.UserDao;
import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.model.User;
import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.model.Address;

public class Main {

    public static void main(String[] args) {
        User bob = new User();
        bob.setUserName("Bob");
        UserDao userDao = new UserDaoImpl();
        userDao.save(bob);

        Address bobAddress = new Address();
        bobAddress.setCity("Kyiv");
        bobAddress.setStreet("Shevchenka st.");
        bobAddress.setUser(bob);

        AddressDao addressDao = new AddressDaoImpl();
        addressDao.save(bobAddress);

        User bobFromDb = userDao.get(1L);
        System.out.println(bobFromDb);
    }
}
