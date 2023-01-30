package section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.db;

import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.model.Author;
import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.model.Book;
import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    public static Map<User, List<Book>> getStatistic() {
        User bob = new User("Bob", 23);
        User alice = new User("Alice", 27);
        User john = new User("John", 32);
        User bill = new User("Bill", 29);

        Author miguelDeCervantes = new Author("Miguel", "de Cervantes");
        Book donQuixote = new Book("Don Quixote", miguelDeCervantes);
        Book espanolaInglesa = new Book("La española inglesa", miguelDeCervantes);

        Author markTwain = new Author("Mark", "Twain");
        Book tomSawyer = new Book("The Adventures of Tom Sawyer", markTwain);

        Book thinkingInJava = new Book("Thinking in Java", new Author("Bruce", "Eckel"));
        Book thinkingInC = new Book("Thinking in C++", new Author("Bruce", "Eckel"));
        Book javaEight = new Book("On Java 8", new Author("Bruce", "Eckel"));

        Map<User, List<Book>> statistic = new HashMap<>();
        statistic.put(bob, List.of(donQuixote, espanolaInglesa)); // Bob likes Miguel de Cervantes's books
        statistic.put(alice, List.of(tomSawyer)); // Alice likes Mark Twain's books
        statistic.put(john, Collections.emptyList());
        statistic.put(bill, List.of(thinkingInJava, thinkingInC, javaEight));

        return statistic;
    }
}
