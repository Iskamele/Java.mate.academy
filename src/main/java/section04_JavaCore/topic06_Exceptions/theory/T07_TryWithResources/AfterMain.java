package section04_JavaCore.topic06_Exceptions.theory.T07_TryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AfterMain {
    public static void main(String[] args) {
        // try - catch - finally

        String filename = "cities.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename));) {
            System.out.println("Everything was OK!");
        } catch (IOException e) {
            System.out.println("Can't read file with name = " + filename);
        }
    }
}
