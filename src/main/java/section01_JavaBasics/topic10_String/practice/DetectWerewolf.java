package section01_JavaBasics.topic10_String.practice;

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
        StringBuilder reverce = new StringBuilder(target).reverse();
        String answer = reverce.toString();
        if (!answer.equals(target)){
            return false;
        }
        return true;
    }
}