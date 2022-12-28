package section04_JavaCore.topic13_PECS.theory.T04_PECSConsumerSuper.model;

public class Plane {
    private String marker;
    private String model;
    private Integer year;

    public Plane(){}

    public Plane(String marker, String model) {
        this.marker = marker;
        this.model = model;
        this.year = 2020;
    }

    public Plane(String marker, String model, Integer year) {
        this.marker = marker;
        this.model = model;
        this.year = year;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
