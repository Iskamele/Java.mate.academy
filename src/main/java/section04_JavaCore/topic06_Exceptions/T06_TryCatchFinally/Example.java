package section04_JavaCore.topic06_Exceptions.T06_TryCatchFinally;

public class Example {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        fileWriter.write("test.txt", "Hello mates!");
    }
}
