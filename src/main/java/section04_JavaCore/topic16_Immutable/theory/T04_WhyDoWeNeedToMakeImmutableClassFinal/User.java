package section04_JavaCore.topic16_Immutable.theory.T04_WhyDoWeNeedToMakeImmutableClassFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class User {
    private String name;
    private String lastname;
    private int age;
    private Address address;
    private List<Language> languages;

    public User(){}
    public User(Builder builder) {
        this.name = builder.name;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.address = builder.address.clone();
        this.languages = new ArrayList<>(builder.languages);
    }

    public static class Builder {
        private String name;
        private String lastname;
        private int age;
        private Address address;
        private List<Language> languages;

        public Builder setName (String name) {
            this.name = name;
            return this;
        }

        public Builder setLastname (String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAge (int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress (Address address) {
            this.address = address;
            return this;
        }

        public Builder setLanguages (List<Language> languages) {
            this.languages = languages;
            return this;
        }

        public User build() {
            return new User(this);
        }
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
        List<Language> copyList = new ArrayList<>();
        for (Language language : languages) {
            copyList.add(language.clone());
        }
        return copyList;
    }
}
