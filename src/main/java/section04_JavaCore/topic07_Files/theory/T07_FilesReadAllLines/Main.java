package section04_JavaCore.topic07_Files.theory.T07_FilesReadAllLines;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("cars.txt");
        try {
            List<String> strings = Files.readAllLines(file.toPath());
            System.out.println(strings);
        } catch (IOException e) {
            throw new RuntimeException("Can't read file", e);
        }
    }
}
