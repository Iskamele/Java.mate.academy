package section04_JavaCore.topic07_Files.theory.T06_BufferedReaderReadingLineByLine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // read data from file
        File file = new File("cars.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder builder = new StringBuilder();
            String value = reader.readLine();
            while (value != null) {
                builder.append(value)
                        .append(System.lineSeparator());
                value = reader.readLine();
            }
            System.out.println(builder);
        } catch (IOException e) {
            throw new RuntimeException("Can't read file", e);
        }
    }
}
