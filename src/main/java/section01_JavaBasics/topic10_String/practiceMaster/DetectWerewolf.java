package section01_JavaBasics.topic10_String.practiceMaster;

public class DetectWerewolf {
    public static void main(String[] args) {
        System.out.println(isWerewolf("rotator"));
        System.out.println(isWerewolf("racecar"));
        System.out.println(isWerewolf("home"));
        System.out.println(isWerewolf("evacaniseebeesinacave"));
        System.out.println(isWerewolf("rOtaTor"));
        System.out.println(isWerewolf(""));
    }

    public static boolean isWerewolf(String target) {
        StringBuilder builder = new StringBuilder(target);
        return target.equals(builder.reverse().toString());
    }
}