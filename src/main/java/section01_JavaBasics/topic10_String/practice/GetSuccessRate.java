package section01_JavaBasics.topic10_String.practice;

public class GetSuccessRate {
    public static void main(String[] args) {
        System.out.println(getSuccessRate("11100"));
        System.out.println(getSuccessRate("11111"));
        System.out.println(getSuccessRate("00000"));
        System.out.println(getSuccessRate(""));
    }

    public static double getSuccessRate(String statistic) {
        // write your code belowe this line
        if (statistic.length() == 0){
            return 0.0;
        }
        double understood = 0;
        double count = 0;
        char[] array = statistic.toCharArray();

        for (char number : array) {
            if (number == '1') {
                understood++;
                count++;
            } else if (number == '0') {
                count++;
            }
        }

        return understood / count;
        // write your code above this line
    }
}