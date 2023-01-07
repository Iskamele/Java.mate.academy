package section04_JavaCore.topic14_HashMap.practice.GetAuthorByBook;

import java.util.List;
import java.util.Map;

public class GetAuthorByBook {
    public String getAuthorNameByBookTitle(Map<Author, List<Book>> authorBooks, String bookTitle) {
            for (Map.Entry<Author, List<Book>> entry : authorBooks.entrySet()) {
                if (entry.getValue().toString().contains(bookTitle)) {
                    return entry.getKey().getName();
                }
            }
        return null;
    }
}
