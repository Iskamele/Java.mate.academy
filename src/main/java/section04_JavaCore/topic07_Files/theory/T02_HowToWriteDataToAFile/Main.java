package section04_JavaCore.topic07_Files.theory.T02_HowToWriteDataToAFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // How to write data to file
        String[] users = new String[]{"Bob", "Alice", "John"};
        File file = new File("users.txt");
        for (String user : users) {
            // write each user into file
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                bufferedWriter.write(user);
            } catch (IOException e) {
                throw new RuntimeException("Can't white data to file", e);
            }
        }
    }
}
