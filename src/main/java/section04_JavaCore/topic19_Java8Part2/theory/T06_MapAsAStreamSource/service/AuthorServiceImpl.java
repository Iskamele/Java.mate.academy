package section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.service;

import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.db.Storage;
import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.model.Author;
import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.model.Book;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AuthorServiceImpl implements AuthorService {
    @Override
    public List<Author> getMostPopularByAudienceAge(int fromAge, int toAge) {
        return Storage.getStatistic().entrySet().stream()
                .filter(e -> e.getKey().getAge() > fromAge && e.getKey().getAge() < toAge)
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }
}
