package section00_DailyTasks.JavaCore.Easy.T23_NumberToReversedArray;

public class ArrayReverse {
    public static int[] toReversedArray(long number) {
        return new StringBuilder(Long.toString(number))
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
