package section04_JavaCore.topic02_MemoryWrappersString.practice;

public class DailyPlanner {
    public static void main(String[] args) {
        String[] array = {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};

        System.out.println(createDailyPlan(array));
    }

    public static String createDailyPlan(String[] plans) {
        StringBuilder builder = new StringBuilder("My plans:");
        int count = 1;
        for (String element : plans) {
            builder.append("\n");
            builder.append(count);
            builder.append(".) ");
            builder.append(element);
            builder.append(";");
            count++;
        }
        return builder.toString();
    }
}
