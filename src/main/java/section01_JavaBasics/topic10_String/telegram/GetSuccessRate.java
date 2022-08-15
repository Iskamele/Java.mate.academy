/*
package section01_JavaBasics.topic10_String.telegram;

public class GetSuccessRate {
    public static void main(String[] args) {

    }

    public static double getSuccessRate(String statistic){
        if(statistic.isEmpty()){
            return 0.0;
        }
        double counter = 0.0;
        char []  statChar = statistic.toCharArray();
        for (double i = statChar){
            if (i == '1'){
                counter += 1.0;
            }
        }
        double statLenght = statChar.length;
        double result = statLenght * counter;
        return result;
    }
}
*/
