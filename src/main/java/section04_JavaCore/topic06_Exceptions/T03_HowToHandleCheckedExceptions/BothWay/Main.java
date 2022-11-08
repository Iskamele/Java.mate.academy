package section04_JavaCore.topic06_Exceptions.T03_HowToHandleCheckedExceptions.BothWay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        // Checked Exceptions

        try {
            String content = readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String content2 = readFile2();

        // throws
        // try catch
    }

    private static String readFile() throws IOException {
        File file = new File("lines.txt");
        return Files.readString(file.toPath());
    }

    // TryCatch следует реализовывать ближе к месту ошибки
    private static String readFile2() {
        File file = new File("lines.txt");
        try {
            return Files.readString(file.toPath());
        } catch (IOException e) {
            return "";
        }
    }
}
