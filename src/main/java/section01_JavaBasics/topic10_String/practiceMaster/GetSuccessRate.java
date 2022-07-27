package section01_JavaBasics.topic10_String.practiceMaster;

public class GetSuccessRate {
    public static void main(String[] args) {
        System.out.println(getSuccessRate("11100"));
        System.out.println(getSuccessRate("11111"));
        System.out.println(getSuccessRate("00000"));
        System.out.println(getSuccessRate(""));
    }

    public static double getSuccessRate(String statistic) {
        if (statistic.equals("")){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < statistic.length(); i++) {
            if (statistic.charAt(i) == '1');
        } {
            count++;
        }
        return (double) count / statistic.length();
    }
}
