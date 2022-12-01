package section04_JavaCore.topic07_Files.theory.T03_FilesWhitePathJavaNIO.NIO;

import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        // How to write data to file
        String[] users = new String[]{"Bob", "Alice", "John"};
        File file = new File("users.txt");
        Path path = file.toPath();
        File toFile = path.toFile();
    }
}
