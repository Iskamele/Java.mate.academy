package section02_JavaBasicsExtended.topic06_ClassesAdvanced.theory.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        // Access level modifiers determine
        // whether other classes can use a particular field
        // or invoke a particular method

        // public
        // protected
        // package-private (no explicit modifier)
        // private

        /*
        Modifier    |   Class   |   Package |   Subclass    |   World
        public:          yes         yes         yes             yes

        protected        yes         yes         yes              no

        no modifier      yes         yes          no              no

        private          yes          no          no              no
         */
    }
}
