package section04_JavaCore.topic08_EqualsHashcodeAndClone.theory.T06_Cloneable.ShallowCloning.model;

public class Address {
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
}
