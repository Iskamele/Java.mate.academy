package section00_DailyTasks.JavaCore.Easy.T05_GetAverageMark.Mentor;

public class GetAverageMark {
    public static int getAverageMark(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}
