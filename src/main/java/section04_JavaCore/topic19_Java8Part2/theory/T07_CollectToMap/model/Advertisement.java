package section04_JavaCore.topic19_Java8Part2.theory.T07_CollectToMap.model;

public class Advertisement {
    private User owner;
    private Car car;

    // date of publications, and other fields


    public Advertisement(User owner, Car car) {
        this.owner = owner;
        this.car = car;
    }

    public User getOwner() {
        return owner;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "owner=" + owner +
                ", car=" + car +
                '}';
    }
}
