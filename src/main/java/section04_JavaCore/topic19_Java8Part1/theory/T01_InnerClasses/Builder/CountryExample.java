package section04_JavaCore.topic19_Java8Part1.theory.T01_InnerClasses.Builder;

public class CountryExample {
    public static void main(String[] args) {
        Country australia = new Country.Builder("Australia", 50_000_000)
                .setRegions(new String[]{"Victoria"})
                .build();
        System.out.println(australia);
    }
}
