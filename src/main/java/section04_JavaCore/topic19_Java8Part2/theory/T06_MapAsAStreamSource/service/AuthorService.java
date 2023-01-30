package section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.service;

import section04_JavaCore.topic19_Java8Part2.theory.T06_MapAsAStreamSource.model.Author;
import java.util.List;

public interface AuthorService {
    List<Author> getMostPopularByAudienceAge(int fromAge, int toAge);
}
