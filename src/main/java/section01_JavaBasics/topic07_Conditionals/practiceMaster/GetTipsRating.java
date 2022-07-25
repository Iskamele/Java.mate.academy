package section01_JavaBasics.topic07_Conditionals.practiceMaster;

public class GetTipsRating {
    public static void main(String[] args) {
        System.out.println(getTipsRating(0));
        System.out.println(getTipsRating(10));
        System.out.println(getTipsRating(19));
        System.out.println(getTipsRating(50));
        System.out.println(getTipsRating(90));
    }

    public static String getTipsRating(int amount) {
        if (amount == 0) {
            return "terrible";
        }
        if (amount <= 10) {
            return "poor";
        }
        if (amount <= 20) {
            return "good";
        }
        if (amount <= 50) {
            return "great";
        }
        return "excellent";
    }
}