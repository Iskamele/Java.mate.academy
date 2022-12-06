package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T05_HashCodeOverride.model;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String inn;

    public User(String name, int age, String inn) {
        this.name = name;
        this.age = age;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Override
    public boolean equals(Object user) {
        // Rules:
        // 1. Reflection: check the object is the same
        if (user == this) {
            return true;
        }
        // 2. Null check
        if (user == null) {
            return false;
        }
        // 3. Symmetric : if a.equals(b) is true then b.equals(a) must be true.
        // 4. Transitive : if a.equals(b) is true and b.equals(c) is true then c.equals(a) must be true.
        // 5. Consistent : multiple invocations of equals() method must return the same
        // value until any of properties are modified.

        // Ментор не рекомендует использование instanceof
        if (user.getClass().equals(User.class)) {
            User current = (User) user;
            return Objects.equals(this.name, current.name)
                    && this.age == current.age
                    && Objects.equals(this.inn, current.inn);
        }
        return false;
    }

    public int hashCode() {
        int result = 17;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + age;
        result = 31 * result + (inn == null ? 0 : inn.hashCode());
        return result;
    }
}
