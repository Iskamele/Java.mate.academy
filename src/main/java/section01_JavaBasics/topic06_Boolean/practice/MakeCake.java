package section01_JavaBasics.topic06_Boolean.practice;

public class MakeCake {
    public static void main(String[] args) {
        boolean hasEggs = true;
        boolean hasFlour = true;
        boolean hasSugar = true;
        boolean canMakeCake;

        canMakeCake = hasEggs && hasFlour && hasSugar;
    }
}
