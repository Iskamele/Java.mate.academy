package section00_DailyTasks.JavaCore.Normal.T04_ResponsibleDrinking.mentor;

public class Drinking {
  public static String hydrate(String drinks) {
    char[] chars = drinks.toCharArray();
    int total = 0;
    for (char element:chars) {
      total = Character.isDigit(element) ? total + Integer.parseInt(String.valueOf(element)) : total;
    }
    return total == 1 ? "1 glass of water" : total + " glasses of water";
  }
}
