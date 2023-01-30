package section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource;

import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.model.Author;
import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.service.AuthorService;
import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.service.AuthorServiceImpl;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Stream API: How to work with Map<K, V>?

        // There is a Map<User, List<Book>>
        // that represents the list of books bought by each User.
        // Find the most popular Authors for users whose age between 25 and 35

        AuthorService authorService = new AuthorServiceImpl();
        List<Author> authors = authorService.getMostPopularByAudienceAge(25, 35);
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}
