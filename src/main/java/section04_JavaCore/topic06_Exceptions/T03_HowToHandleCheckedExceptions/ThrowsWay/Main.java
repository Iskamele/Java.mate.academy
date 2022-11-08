package section04_JavaCore.topic06_Exceptions.T03_HowToHandleCheckedExceptions.ThrowsWay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) throws IOException {
        // Checked Exceptions

        String content = readFile();

        // throws
        // try catch
    }

    private static String readFile() throws IOException {
        File file = new File("lines.txt");
        return Files.readString(file.toPath());
    }
}
