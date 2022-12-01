package section04_JavaCore.topic07_Files.theory.T08_AbsoluteAndRelativePath;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Absolute and relative path

        // Bad absolute path
        // File file = new File("C:\Users\Aegis\Desktop\Java.mate.academy\cars.txt");

        File file = new File("cars.txt");
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        // . ./ ./../
        Path parentDir = Paths.get(".");
        System.out.println(parentDir.toAbsolutePath());
        System.out.println(parentDir);

        Path parentDir2 = Paths.get("./myFolder");
        System.out.println(parentDir2.toAbsolutePath());
        System.out.println(parentDir2);

        Path parentDir3 = Paths.get("./src/main/java/section01_JavaBasics");
        System.out.println(parentDir3.toAbsolutePath());
        System.out.println(parentDir3);

        Path parentDir4 = Paths.get("./src/main/java/section01_JavaBasics/../section02_JavaBasicsExtended");
        System.out.println(parentDir4.toAbsolutePath());
        System.out.println(parentDir4);

        listFilesForFolder(parentDir4.toFile());
    }

    private static void listFilesForFolder(File folder) {
        for(File fileEntry : folder.listFiles()){
            System.out.println("Is directory: "
                    + fileEntry.isDirectory()
                    + ". File name: "
                    + fileEntry.getName());
        }
    }
}
