package section04_JavaCore.topic07_Files.practice.WorkWithBytes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WorkWithBytes {
  public void writeBytesToFile(String fileName, byte[] data) {
    File file = new File(fileName);
    try {
      file.createNewFile();
    } catch (IOException e) {
      throw new RuntimeException("Can't create file", e);
    }
    try {
      Files.write(file.toPath(), data, StandardOpenOption.APPEND);
    } catch (IOException e) {
      throw new RuntimeException("Can't write data to file", e);
    }
  }
}
