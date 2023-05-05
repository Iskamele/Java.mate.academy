package section00_DailyTasks.JavaCore.Normal.T11_FirstMultiplesOfNumber;

public class MultiplesOfNumber {
    public static int[] getMultiples(int multiples, int number) {
        int[] array = new int[multiples];
        array[0] = number;
        for (int i = 1; i <= array.length - 1; i++) {
            array[i] = array[i - 1] + number;
        }
        return array;
    }
}
