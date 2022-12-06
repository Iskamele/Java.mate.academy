package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T06_Cloneable.DeepCloning.model;

public class Address implements Cloneable{
    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address {" +
                "street = '" + street + '\'' +
                "}";
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can't clone address", e);
        }
    }
}
