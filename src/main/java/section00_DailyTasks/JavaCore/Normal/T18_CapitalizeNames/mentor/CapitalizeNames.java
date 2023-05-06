package section00_DailyTasks.JavaCore.Normal.T18_CapitalizeNames.mentor;

public class CapitalizeNames {
    public static String[] capitalizeNames(String[] names) {
        String[] result = new String[names.length];
        int counter = 0;
        for (String name : names) {
            result[counter] = (Character.toUpperCase(name.charAt(0)) + name.toLowerCase().substring(1));
            counter++;
        }
        return result;
    }
}
