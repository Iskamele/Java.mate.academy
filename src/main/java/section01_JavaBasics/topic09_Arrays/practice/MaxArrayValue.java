package section01_JavaBasics.topic09_Arrays.practice;

public class MaxArrayValue {
    public static void main(String[] args) {
        int[] array = {1,5,77,33,22,63,84,6};
        System.out.println(getMaxNumber(array));
    }
    public static int getMaxNumber(int[] numbers) {

        int answer = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (answer < numbers[i]){
                answer = numbers[i];
            }
        }
        return answer;
    }
}