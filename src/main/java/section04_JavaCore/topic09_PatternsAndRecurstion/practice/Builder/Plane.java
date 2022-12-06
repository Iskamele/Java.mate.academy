package section04_JavaCore.topic09_PatternsAndRecurstion.practice.Builder;

public class Plane {
    private String model;
    private String type;
    private int year;
    private int speed;
    private int carryWeight;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.type = builder.type;
        this.year = builder.year;
        this.speed = builder.speed;
        this.carryWeight = builder.carryWeight;
    }

    public static class PlaneBuilder {
        private String model;
        private String type;
        private int year;
        private int speed;
        private int carryWeight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;

        }

        public PlaneBuilder setCarryWeight(int carryWeight) {
            this.carryWeight = carryWeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
