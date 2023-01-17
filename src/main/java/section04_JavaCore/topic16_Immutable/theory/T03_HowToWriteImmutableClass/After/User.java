package section04_JavaCore.topic16_Immutable.theory.T03_HowToWriteImmutableClass.After;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class User {
    private final String name;
    private final String lastname;
    private final int age;
    private Address address;
    private List<Language> languages;

    public User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public User(String name, String lastname, int age, Address address, List<Language> languages) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address.clone();
        this.languages = new ArrayList<>(languages);
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
                && Objects.equals(address, user.address)
                && Objects.equals(languages, user.languages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, address, languages);
    }

    @Override
    public String toString() {
        return "User " +
                "name = '" + name + '\'' +
                ", lastname = '" + lastname;
    }

    // Для String не нужна deep copy, поскольку она по дефолту Immutable
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address.clone();
    }

    public List<Language> getLanguages() {
        return new ArrayList<>(languages);
    }
}
