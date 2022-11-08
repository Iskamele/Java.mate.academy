package section04_JavaCore.topic06_Exceptions.T03_HowToHandleCheckedExceptions.TryCatchWay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        // Checked Exceptions

        File file = new File("lines.txt");
        try {
            String content = Files.readString(file.toPath());
        } catch (IOException e) {
            System.out.println("Exception");
        }

        // throws
        // try catch
    }
}
