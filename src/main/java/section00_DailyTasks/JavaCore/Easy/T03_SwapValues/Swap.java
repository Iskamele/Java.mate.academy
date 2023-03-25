
package section00_DailyTasks.JavaCore.Easy.T03_SwapValues;

public class Swap {
    public Object[] arguments;

    public Swap(final Object[] args) {
        arguments = args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0], arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
        arguments = args;
    }
}
