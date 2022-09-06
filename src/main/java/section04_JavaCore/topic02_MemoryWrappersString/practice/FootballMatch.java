package section04_JavaCore.topic02_MemoryWrappersString.practice;

public class FootballMatch {
    public static void main(String[] args) {

        System.out.println(matchResult(1, 2, 1, 3)); // 1
        System.out.println(matchResult(1, 1, 1, 2)); // 0
    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {

        /*
        if (result1 == bet1 && result2 == bet2) {
            return 2;
        } else if (result1 == result2 && bet1 == bet2 || result1 > result2 && bet1 > bet2 || result1 < result2 && bet1 < bet2) {
            return 1;
        } else {
            return 0;
        }
        */

        return (result1 == bet1 && result2 == bet2) ? 2 : ((result1 == result2 && bet1 == bet2 || result1 > result2 && bet1 > bet2 || result1 < result2 && bet1 < bet2) ? 1 : 0);
    }
}