package section04_JavaCore.topic19_Java8Part1.theory.T01_InnerClasses;

public class Main {

    public static void main(String[] args) {
        // Inner classes

        // 1. Static Nested class: builder

        // 2. Non-Static Inner class: Node LinkedList class

        // 3. Local class: Local in Main

        // 4. Anonymous class: Comparator.
        // - Анонимный класс мы можем создать только один раз
        // и больше мы не сможем его использовать,
        // в отличии от объекта этого класса. Который ничем не будет
        // отличаться от какого-либо другого объекта
        // - Повторение анонимного класса в другом месте программы
        // будет считаться другим анонимным классом


        // 2. Non-Static Inner class: Node LinkedList class

        LinkedList list = new LinkedList();
        LinkedList.Node node = list.new Node();
        list.setKey("KEY!!!!");
        node.setValue("VALUE!!!");
        System.out.println(node.toString());

        // 3. Local class

        class Local {
            private String type;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            @Override
            public String toString() {
                return "Local{" +
                        "type='" + type + '\'' +
                        '}';
            }
        }
        Local local = new Local();
        local.setType("JAVA");
        System.out.println(local.toString());
    }
}
