package section04_JavaCore.topic19_Java8Part1.theory.T01_InnerClasses.Builder;

import java.util.Arrays;

public class Country {
    private String name;
    private int population;
    private Country[] neighbours;
    private String[] regions;
    private String[] previousNames;

    private Country(Builder builder) {
        this.name = builder.name;
        this.population = builder.population;
        this.neighbours = builder.neighbours;
        this.regions = builder.regions;
        this.previousNames = builder.previousNames;
    }

    public static class Builder {
        private String name;
        private int population;
        private Country[] neighbours;
        private String[] regions;
        private String[] previousNames;

        public Builder(String name, int population) {
            this.name = name;
            this.population = population;
        }

        public Builder setNeighbours(Country[] neighbours) {
            this.neighbours = neighbours;
            return this;
        }

        public Builder setRegions(String[] regions) {
            this.regions = regions;
            return this;
        }

        public Builder setPreviousNames(String[] previousNames) {
            this.previousNames = previousNames;
            return this;
        }

        public Country build() {
            if (this.population <= 0) {
                throw new RuntimeException("Can't create Country object. "
                        + "Population cannot be less than 0");
            }
            return new Country(this);
        }
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", neighbours=" + Arrays.toString(neighbours) +
                ", regions=" + Arrays.toString(regions) +
                ", previousNames=" + Arrays.toString(previousNames) +
                '}';
    }
}