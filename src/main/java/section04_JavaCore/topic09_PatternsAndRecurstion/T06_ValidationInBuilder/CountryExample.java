package section04_JavaCore.topic09_PatternsAndRecurstion.T06_ValidationInBuilder;

public class CountryExample {
    public static void main(String[] args) {
        // Builder example
        Country vatican = new Country.Builder("Vatican", -1000).build();
        Country ukraine = new Country.Builder("Ukraine", 36_000_000)
                .setRegions(new String[] {"Kyiv", "Donetsk", "Simferopol"})
                .setPreviousNames(new String[] {"Kyiv Rus'"})
                .setNeighbours(new Country[] { /* TODO add countries*/})
                .build();

        Country australia = new Country.Builder("Australia", 50_000_000)
                .setRegions(new String[]{"Victoria"})
                .build();
    }
}
