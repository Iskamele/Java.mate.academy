package section04_JavaCore.topic09_PatternsAndRecurstion.theory.T04_Builder;

public class Car {
    private String model;
    private String color;
    private int year;
    private double engineVolume;
    private int horsePowers;

    private Car(Builder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.engineVolume = builder.engineVolume;
        this.horsePowers = builder.horsePowers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", engineVolume=" + engineVolume +
                ", horsePowers=" + horsePowers +
                '}';
    }

    public static class Builder {
        private String model;
        private String color;
        private int year;
        private double engineVolume;
        private int horsePowers;

        public Builder setModel (String model) {
            this.model = model;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public Builder setHorsePowers(int horsePowers) {
            this.horsePowers = horsePowers;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
