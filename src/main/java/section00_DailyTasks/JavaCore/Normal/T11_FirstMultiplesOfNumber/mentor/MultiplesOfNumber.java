package section00_DailyTasks.JavaCore.Normal.T11_FirstMultiplesOfNumber.mentor;

public class MultiplesOfNumber {
    public static int[] getMultiples(int multiples, int number) {
        int[] result = new int[multiples];
        int num = 1;
        for (int i = 0; i < multiples; i++) {
            result[i] = number * num;
            num++;
        }
        return result;
    }
}
