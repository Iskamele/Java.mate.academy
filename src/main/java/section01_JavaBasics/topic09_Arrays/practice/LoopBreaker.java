package section01_JavaBasics.topic09_Arrays.practice;

public class LoopBreaker {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 2, 7, 9, 7};
        int[] array2 = {2, 3, 5, 7, 9, 6};
        int[] array3 = {2, 4, 6, 7, 9, 1, 2};
        int[] array4 = {2, 4, 6, 1, 2, 3};

        System.out.println((getSum(array1) == 25) ? "true" : "false"); // 25 (2 3 5) 2 + 7 + 9 + 7 // 23 false
        System.out.println((getSum(array2) == 22) ? "true" : "false"); // 22 (2 3 5) 7 + 9 + 6     // 16 false
        System.out.println((getSum(array3) == 16) ? "true" : "false"); // 16 (2 4 6) 7 + 9 / 1 + 2 // 16 true
        System.out.println((getSum(array4) == 0) ? "true" : "false");  // 0 (2 4 6) / 1 2 3        // 0  true
    }

    public static int getSum(int[] numbers) {
        int answer = 0;

        for (int i = numbers.length / 2; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                break;
            }
            answer = answer + numbers[i];
        }
        System.out.print(answer + " ");
        return answer;
    }
}