package section00_DailyTasks.JavaCore.Normal.T14_ExtractFileName;

public class FileNameExtractor {
    private static final String DATE_REGEX = "\\d+_";
    private static final String EXTRA_EXTENSION_REGEX = "\\.\\w+$";

    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.replaceFirst(DATE_REGEX, "")
                .replaceFirst(EXTRA_EXTENSION_REGEX, "");
    }
}