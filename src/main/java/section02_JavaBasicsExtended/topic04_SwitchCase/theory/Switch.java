package section02_JavaBasicsExtended.topic04_SwitchCase.theory;

public class Switch {
    public static void main(String[] args) {
        // depending on maturity, the person wants to perform an action

        // child wants to play
        // adult want to work
        // any other person wants to dance

        // implement this using switch-case operator

        String maturity = "child";

        switch (maturity) {
            case "child": {
                System.out.println("I want to play");
                break;
            }
            case "adult": {
                System.out.println("I want to work");
                break;
            }
            default: {
                System.out.println("I want to dance");
                break;
            }
        }
    }
}
