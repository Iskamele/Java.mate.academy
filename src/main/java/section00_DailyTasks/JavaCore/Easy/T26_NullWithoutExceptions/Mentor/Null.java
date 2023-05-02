package section00_DailyTasks.JavaCore.Easy.T26_NullWithoutExceptions.Mentor;

public class Null {

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object other) {
        return other == null || other instanceof Null;
    }

    public String toString() {
        return "null";
    }
}
