package section04_JavaCore.topic06_Exceptions.theory.T06_TryCatchFinally;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // try - catch - finally

        String filename = "cities.txt";
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(Paths.get(filename));
            System.out.println("Everything was OK!");
                    } catch (IOException e) {
            System.out.println("Can't read file with name = " + filename);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
