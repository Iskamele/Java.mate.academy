package Daily.JavaCore.Normal.T14_ExtractFileName;

import section00_DailyTasks.JavaCore.Normal.T14_ExtractFileName.FileNameExtractor;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FileNameExtractorTest {
    private static Map<String, String> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put("0_file.txt.zip", "file.txt");
        data.put("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION", "FILE_NAME.EXTENSION");
        data.put("1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34", "This_is_an_otherExample.mpg");
        data.put("1231231223123131_myFile.tar.gz2", "myFile.tar");
        data.put("999_12filename90.html.css", "12filename90.html");
    }

    @Test
    public void extractFileName_fromDirtyToClean() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String input = entry.getKey();
            String expected = entry.getValue();
            String actual = FileNameExtractor.extractFileName(input);
            Assert.assertEquals(String.format("The result should be \"%s\" for a file name \"%s\"\n",
                    expected, input), expected, actual);
        }
    }
}
