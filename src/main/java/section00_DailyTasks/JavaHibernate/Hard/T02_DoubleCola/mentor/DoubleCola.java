package section00_DailyTasks.JavaHibernate.Hard.T02_DoubleCola.mentor;

public class DoubleCola {
    public static String getNthPerson(String[] names, int n) {
        int line = names.length;
        int copies = 1;
        while (n > line * copies) {
            n -= line * copies;
            copies *= 2;
        }
        return names[(n - 1) / copies];
    }
}
