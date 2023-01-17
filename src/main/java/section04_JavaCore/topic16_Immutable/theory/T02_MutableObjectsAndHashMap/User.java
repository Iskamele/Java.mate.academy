package section04_JavaCore.topic16_Immutable.theory.T02_MutableObjectsAndHashMap;

import java.util.Objects;

public class User {
    private String name;
    private String lastname;
    private int age;
    private Address address;

    public User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name)
                && Objects.equals(lastname, user.lastname)
                && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, address);
    }

    @Override
    public String toString() {
        return "User " +
                "name = '" + name + '\'' +
                ", lastname = '" + lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }
}
