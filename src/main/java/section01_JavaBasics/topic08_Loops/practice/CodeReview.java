package section01_JavaBasics.topic08_Loops.practice;

public class CodeReview {
    public static void main(String[] args) {

    }
    public static int reviewCode(int maxAttempts) {
        int solutionAttempts = 0;

        do {
            solutionAttempts++;
        } while (solutionAttempts < maxAttempts);

        return solutionAttempts;
    }
}
