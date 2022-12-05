package JavaCore.topic07_Files.WorkWithBytes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section04_JavaCore.topic07_Files.practice.WorkWithBytes.WorkWithBytes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithBytesTest {
  private static final String FIRST_FILE_PATH = "/tmp/first.txt";
  private static final String SECOND_FILE_PATH = "/tmp/second.txt";
  private static final String THIRD_FILE_PATH = "/tmp/third.txt";
  private static final String INVALID_PATH = "";
  private static final File firstFile = new File(FIRST_FILE_PATH);
  private static final File secondFile = new File(SECOND_FILE_PATH);
  private static final File thirdFile = new File(THIRD_FILE_PATH);
  private final WorkWithBytes workWithFile = new WorkWithBytes();

  @Before
  public void initFiles() throws Exception {
    firstFile.createNewFile();
    secondFile.createNewFile();
    thirdFile.createNewFile();
  }

  @After
  public void clearFiles() throws Exception {
    Files.deleteIfExists(Path.of(FIRST_FILE_PATH));
    Files.deleteIfExists(Path.of(SECOND_FILE_PATH));
    Files.deleteIfExists(Path.of(THIRD_FILE_PATH));
  }

  @Test
  public void writeBytesToFile_writeLineToFile() {
    byte[] data = {72, 101, 108, 108, 111, 32, 102, 114, 111, 109, 32, 109, 97, 116, 101, 33};
    workWithFile.writeBytesToFile(FIRST_FILE_PATH, data);
    String actualResult = readFromFile(FIRST_FILE_PATH).trim();
    String expectedResult = new String(data);
    Assert.assertEquals("Wrong data in the file.\n", expectedResult, actualResult);
  }

  @Test
  public void writeBytesToFile_writeTwoLinesToFile() {
    byte[] data = {45, 32, 87, 104, 97, 116, 32, 105, 115, 32, 121, 111, 117, 114, 32, 110,
      97, 109, 101, 63, 10, 45, 32, 77, 121, 32, 110, 97, 109, 101, 32, 105, 115, 32,
      74, 111, 104, 110, 115, 58, 41};
    workWithFile.writeBytesToFile(SECOND_FILE_PATH, data);
    String actualResult = readFromFile(SECOND_FILE_PATH).trim();
    String expectedResult = new String(data);
    Assert.assertEquals("Wrong data in the file.\n", expectedResult, actualResult);
  }

  @Test
  public void writeBytesToFile_writeLinesWithTabulationToFile() {
    byte[] data = {65, 49, 10, 9, 65, 50, 10, 9, 9, 65, 51, 10, 9, 9, 9, 65, 52};
    workWithFile.writeBytesToFile(THIRD_FILE_PATH, data);
    String actualResult = readFromFile(THIRD_FILE_PATH).trim();
    String expectedResult = new String(data);
    Assert.assertEquals("Wrong data in the file.\n", expectedResult, actualResult);
  }

  @Test
  public void writeBytesToFile_invalidFilePath() {
    byte[] data = {43, 3, 52, 1, 44, 75, 32, 89, 4};
    Exception exception = new Exception();
    try {
      workWithFile.writeBytesToFile(INVALID_PATH, data);
    } catch (Exception e) {
      exception = e;
    }
      Assert.assertEquals(String.format("For an invalid file path %s should be thrown, but was %s\n",
        RuntimeException.class, exception.getClass()),
        RuntimeException.class, exception.getClass());
  }

  private String readFromFile(String fileName) {
    try {
      return Files.readString(Path.of(fileName));
    } catch (IOException e) {
      throw new RuntimeException("Can't correctly read data from file " + fileName);
    }
  }
}
