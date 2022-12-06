package section04_JavaCore.topic09_PatternsAndRecurstion.theory.T04_Builder;

public class Main {
    public static void main(String[] args) {
        // Builder


     Car redAudi = new Car.Builder()
             .setModel("Audi")
             .setColor("Red")
             .setYear(1999)
             .build();
        System.out.println(redAudi.toString());

        Car.Builder blueAudiBuilder = new Car.Builder()
                .setModel("Audi")
                .setColor("blue");

        Car blueAudi = blueAudiBuilder.setYear(1999).build();
        Car blueAudiHorsePower = blueAudiBuilder.setHorsePowers(200).build();
        System.out.println(blueAudi.toString());

        // Builder example
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" world").append(" mates!");
        System.out.println(builder);
    }
}
