package Other.DirectoryNameConverterV1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/Other/DirectoryNameConverterV1/names.txt");
        try {
            StringBuilder builder = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String value = reader.readLine();
            int single = 1;
            int tenths = 0;
            while (value != null) {
                if (value.isEmpty()) {
                    value = reader.readLine();
                    continue;
                }
                String[] words = value.replaceAll("[^a-zA-Z ]", "").split(" ");
                builder.append("T")
                        .append(tenths)
                        .append(single)
                        .append("_");
                for (String word : words) {
                    builder.append(word.substring(0, 1).toUpperCase())
                            .append(word.substring(1));
                }
                single++;
                if (single > 9) {
                    tenths++;
                    single = 0;
                }
                builder.append(System.lineSeparator());
                value = reader.readLine();
            }
            System.out.println(builder);
        } catch (IOException e) {
            throw new RuntimeException("Can't read file ", e);
        }

    }
}
