package section01_JavaBasics.topic07_Conditionals.practice;

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
        } else if (amount <= 10) {
            return "poor";
        } else if (amount <= 20) {
            return "good";
        } else if (amount <= 50) {
            return "great";
        } else {
            return "excellent";
        }
    }
}
