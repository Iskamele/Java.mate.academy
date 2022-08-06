package section02_JavaBasicsExtended.topic04_SwitchCase;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        // Print the message
        // if physics, math or chemistry print "SCIENCE"
        // if football, basketball or tennis print "SPORT"
        // if walking, watching TV print "HOBBY"

        // Use only switch-case construction

        String activity = "math";

        switch (activity){
            case "math":
            case "physics":
            case "chemistry":
                System.out.println("SCIENCE");
                break;
            case "football":
            case "basketball":
            case "tennis":
                System.out.println("SPORT");
                break;
            case "walking":
            case "watching":
                System.out.println("HOBBY");
        }
    }
}
