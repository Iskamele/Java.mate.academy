package section00_DailyTasks.JavaCore.Normal.T04_ResponsibleDrinking;

public class Drinking {
    public static String hydrate(String drinks) {
        String removeExtraCharacters = drinks.replaceAll("[^0-9\\s]", "");
        String[] split = removeExtraCharacters.split(" ");
        int glassesOfWater = 0;
        for (String string : split) {
            if (!string.isEmpty()) {
                glassesOfWater += Integer.parseInt(string);
            }
        }
        return (glassesOfWater == 1) ? glassesOfWater + " glass of water" : glassesOfWater + " glasses of water";
    }
}
