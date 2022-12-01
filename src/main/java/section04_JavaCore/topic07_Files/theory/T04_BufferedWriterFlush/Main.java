package section04_JavaCore.topic07_Files.theory.T04_BufferedWriterFlush;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Refactor the code
        // flush() method
        String[] users = new String[]{"Bob", "Alice", "John"};
        File file = new File("users.txt");
        // write each user into file
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (String user : users) {
                bufferedWriter.write(user + " ");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to file", e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException("Can't close BufferedWriter", e);
                }
            }
        }
    }
}
