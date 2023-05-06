package section00_DailyTasks.JavaCore.Normal.T14_ExtractFileName.mentor;

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.substring(dirtyFileName.indexOf('_') + 1, dirtyFileName.lastIndexOf("."));
    }
}
