package section04_JavaCore.topic06_Exceptions.T06_TryCatchFinally;

public class FirstMain {
    public static void main(String[] args) {
        // try - catch - finally

        try {
            System.out.println("Try block");
            int size = 5 / 0;
            System.out.println("Try block completed");
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }
    }
}
