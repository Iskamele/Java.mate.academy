package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T06_Cloneable.ShallowCloning;

import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T06_Cloneable.ShallowCloning.model.Address;
import section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T06_Cloneable.ShallowCloning.model.User;

public class Main {
    public static void main(String[] args) {
        // Cloneable

        Address address = new Address();
        address.setStreet("Shevchenka");

        User bob = new User();
        bob.setName("Bob");
        bob.setLastname("Alison");
        bob.setAddress(address);

        System.out.println(bob);
        // Поверхностное клонирование
        User clonedBob = bob.clone();
        bob.getAddress().setStreet("Popova");
        System.out.println(bob);
        System.out.println("Cloned " + clonedBob);
    }
}
