package section04_JavaCore.topic06_Exceptions.theory.T06_TryCatchFinally;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {
    public void write(String destinationFile, String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new java.io.FileWriter(destinationFile));
            writer.write(content.toLowerCase());
//            if (true) {
//                throw new IOException("Test");
//            }
            writer.write(content.toUpperCase());
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file " + destinationFile, e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException("Can't close resource ", e);
                }
            }
        }
    }
}
