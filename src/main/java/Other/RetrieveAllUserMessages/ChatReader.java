package Other.RetrieveAllUserMessages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChatReader {
    public static void main(String[] args) {
        String filePath = "src/main/java/Other/RetrieveAllUserMessages/chat.txt";
        String username = "Алиса";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            boolean foundUser = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(username) && line.endsWith("]")) {
                    foundUser = true;
                    continue;
                } else if (!line.contains(username) && line.endsWith("]")) {
                    foundUser = false;
                }

                if (foundUser) {
                    System.out.println(line);
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}