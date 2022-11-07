package section04_JavaCore.topic06_Exceptions.T02_ExceptionsHierarchyCheckedAndUncheckedExceptions;

public class Main {
    public static void main(String[] args) {
        // Exception Hierarchy

        // 1. Error
        // 2. Checked Exception
        // 3. Unchecked Exception

        // 1.
        // Throwable
        // StackOverflowError
        // OutOfMemoryError - when heap memory is end

        // 2. Next video

        // 3. Developers mistakes

        NullPointerException e;
        String s = null;
        if (s != null){
            s.toUpperCase();
        }

        IndexOutOfBoundsException c;
        int[] array = new int[3];
        int value = array[4];

        // Throwable > Error
        //           > Exception > Unchecked (Runtime) Exceptions > NullPointerException, IndexOutOfBoundsException, ...
        //                       > Checked (Compile) Exceptions > IOException, SQLException

    }
}
