package section04_JavaCore.topic06_Exceptions.T08_MultipleInstancesWithTWR;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Multiple instances with TWR
        String filename = "cities.txt";

        try (MyResource resource = new MyResource();
             BufferedReader newReader = Files.newBufferedReader(Paths.get(filename))){
            System.out.println("Try with resources");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
