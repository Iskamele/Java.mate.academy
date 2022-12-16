package section04_JavaCore.topic11_ArrayList.theory.T01_CollectionsFrameworkOverview;

public class Main {
    public static void main(String[] args) {
     // Java Collections Framework
        /*
        Collection
            List:
                Есть индексация, можно обращаться к объектам по порядковому номеру.
                Можно хранить дубликаты.
            Set:
                Нельзя получить элемент по индексу.
                Нельзя хранить дубликаты.
            Queue:
                Описывает структуру данных, такую, как очередь
                Работает по принципу first in и first out, т.е. первый пришёл - первый ушёл.
         */
        /*
        Collection <interface>
            Set <interface>                   | extends
                HashSet                       | implements
                    LinkedHashSet             | extends
                SortedSet <interface>         | extends
                    NavigableSet <interface>  | extends
                        TreeSet               | implements
            List <interface>                  | extends
                ArrayList                     | implements
                Vector                        | implements
                LinkedList                    | implements
            Queue <interface>                 | extends
                LinkedList                    | implements
                PriorityQueue                 | implements
         */

    }
}
