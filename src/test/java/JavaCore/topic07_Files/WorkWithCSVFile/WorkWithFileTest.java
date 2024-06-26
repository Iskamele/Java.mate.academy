package JavaCore.topic07_Files.WorkWithCSVFile;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import section04_JavaCore.topic07_Files.practice.WorkWithCSVFile.WorkWithFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithFileTest {
    private WorkWithFile workWithFile = new WorkWithFile();
    private static final String APPLE_RESULT_FILE = "appleResult.csv";
    private static final String GRAPE_RESULT_FILE = "grapeResult.csv";
    private static final String ORANGE_RESULT_FILE = "orangeResult.csv";
    private static final String BANANA_RESULT_FILE = "bananaResult.csv";

    @After
    public void clearResults() {
        try {
            Files.deleteIfExists(Path.of(APPLE_RESULT_FILE));
            Files.deleteIfExists(Path.of(GRAPE_RESULT_FILE));
            Files.deleteIfExists(Path.of(ORANGE_RESULT_FILE));
            Files.deleteIfExists(Path.of(BANANA_RESULT_FILE));
        } catch (IOException e) {
            throw new RuntimeException("Can't correctly clear result files after test ", e);
        }
    }

    @Test
    public void getStatisticAboutApple() {
        workWithFile.getStatistic("./FilesForTests/JavaCore/WorkWithCSVFile/apple.csv", APPLE_RESULT_FILE);

        String actualResult = readFromFile(APPLE_RESULT_FILE).trim();
        String expectedResult = "supply,188" + System.lineSeparator()
                + "buy,115" + System.lineSeparator()
                + "result,73";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getStatisticAboutOrange() {
        workWithFile.getStatistic("./FilesForTests/JavaCore/WorkWithCSVFile/orange.csv", ORANGE_RESULT_FILE);

        String actualResult = readFromFile(ORANGE_RESULT_FILE).trim();
        String expectedResult = "supply,295" + System.lineSeparator()
                + "buy,154" + System.lineSeparator()
                + "result,141";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getStatisticAboutGrape() {
        workWithFile.getStatistic("./FilesForTests/JavaCore/WorkWithCSVFile/grape.csv", GRAPE_RESULT_FILE);

        String actualResult = readFromFile(GRAPE_RESULT_FILE).trim();
        String expectedResult = "supply,352" + System.lineSeparator()
                + "buy,352" + System.lineSeparator()
                + "result,0";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getStatisticAboutBanana() {
        workWithFile.getStatistic("./FilesForTests/JavaCore/WorkWithCSVFile/banana.csv", BANANA_RESULT_FILE);

        String actualResult = readFromFile(BANANA_RESULT_FILE).trim();
        String expectedResult = "supply,491" + System.lineSeparator()
                + "buy,293" + System.lineSeparator()
                + "result,198";
        Assert.assertEquals(expectedResult, actualResult);
    }

    private String readFromFile(String fileName) {
        try {
            return Files.readString(Path.of(fileName));
        } catch (IOException e) {
            throw new RuntimeException("Can't correctly read data from file " + fileName, e);
        }
    }
}
