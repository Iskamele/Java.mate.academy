package section04_JavaCore.topic07_Files.theory.T03_FilesWhitePathJavaNIO.old;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        // How to write data to file
        String[] users = new String[]{"Bob", "Alice", "John"};
        File file = new File("users.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Can't create file", e);
        }
        for (String user : users) {
            // write each user into file
            try {
                Files.write(file.toPath(), user.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException("Can't write data to file", e);
            }
        }
    }
}
