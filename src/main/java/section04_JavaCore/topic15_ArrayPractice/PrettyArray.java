package section04_JavaCore.topic15_ArrayPractice;

public class PrettyArray {
    public static void main(String[] args) {
        int[] array = {2, 10, 3, 9};
        System.out.println(isArrayPretty(array));
    }

    public static boolean isArrayPretty(int[] array) {
        if (array.length == 0) {
            return false;
        }
        boolean isBeautiful = true;
        for (int k : array) {
            for (int i : array) {
                if (k == i - 1 || k == i + 1) {
                    isBeautiful = true;
                    break;
                } else {
                    isBeautiful = false;
                }
            }
            if (!isBeautiful) {
                return false;
            }
        }
        return true;
    }
}
