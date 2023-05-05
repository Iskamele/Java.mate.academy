package section00_DailyTasks.JavaCore.Normal.T18_CapitalizeNames;

public class CapitalizeNames {
    public static String[] capitalizeNames(String[] names) {
        if (names.length == 0) {
            return names;
        }
        StringBuilder builder = new StringBuilder();
        for (String name : names) {
            builder.append(name.substring(0, 1).toUpperCase());
            builder.append(name.substring(1).toLowerCase());
            builder.append(" ");
        }
        return builder.toString().trim().split(" ");
    }
}
