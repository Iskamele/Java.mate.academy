package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T06_Cloneable.DeepCloning.model;

public class User implements Cloneable {
    private String name;
    private String lastname;
    private Address address;


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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User {" +
                "name = '" + name + '\'' +
                ", lastname = '" + lastname + '\'' +
                ", address = " + address +
                "}";
    }

    @Override
    public User clone() {
        try {
            User clonedUser = (User) super.clone();
            clonedUser.setAddress(address.clone());
            return clonedUser;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't create User clone", e);
        }
    }
}
