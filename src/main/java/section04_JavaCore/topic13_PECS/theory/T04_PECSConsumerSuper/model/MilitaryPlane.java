package section04_JavaCore.topic13_PECS.theory.T04_PECSConsumerSuper.model;

public class MilitaryPlane extends Plane {
    private String country;

    public MilitaryPlane(String marker, String model) {
        super(marker, model);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
