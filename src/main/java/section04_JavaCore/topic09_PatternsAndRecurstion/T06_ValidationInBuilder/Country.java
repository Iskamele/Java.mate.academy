package section04_JavaCore.topic09_PatternsAndRecurstion.T06_ValidationInBuilder;

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

        public Country build(){
        if (this.population <= 0) {
            throw new RuntimeException("Can't create County object. Population cannot be less than 0");
        }
            return new Country(this);
        }
    }
}
