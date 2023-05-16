package section00_DailyTasks.JavaHibernate.Hard.T02_DoubleCola;

public class DoubleCola {
    public static String getNthPerson(String[] names, int n) {
        int arrLeng = names.length;
        int j = 1;
        while (n > arrLeng) {
            n -= arrLeng;
            arrLeng *= 2;
        }
        while (n > arrLeng / names.length * j) {
            j++;
        }
        return names[j - 1];
    }
}
