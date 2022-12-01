package section04_JavaCore.topic07_Files.theory.T01_ClassFileOverview;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Files

        // file.getAbsoluteFile() посмотреть путь к файлу, начиная с корневой директории
        // file.exists() посмотреть, существует ли файл
        // file.getName() узнать имя файла

        try {
            File folder = new File("myFolder");
            folder.mkdir();

            // File separator
            // '/' - Linux
            // '\\' Windows
            // Поэтому нужно использовать File.separator

            String filePath = "src" + File.separator + "main"
                    + File.separator + "java"
                    + File.separator + "section04_JavaCore"
                    + File.separator + "topic07_Files"
                    + File.separator + "theory"
                    + File.separator + "T01_ClassFileOverview"
                    + File.separator + "hello.txt";
            File file = new File(filePath);
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException("Can't create file, e");
        }
    }
}
