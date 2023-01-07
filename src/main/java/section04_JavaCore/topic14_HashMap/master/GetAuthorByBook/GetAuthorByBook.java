package section04_JavaCore.topic14_HashMap.master.GetAuthorByBook;

import java.util.List;
import java.util.Map;

public class GetAuthorByBook {
    public String getAuthorNameByBookTitle(Map<Author, List<Book>> authorBooks, String bookTitle) {
    /*
      iterate through every element in map using entrySet()
      because we don't know nor keys nor values that map contains
    */
        for (Map.Entry<Author, List<Book>> entry : authorBooks.entrySet()) {
            // variable for storing books of current author
            List<Book> books = entry.getValue();
            // iterate through every element in list
            for (Book book : books) {
                // check if current element's title equals to target one
                if (book.getTitle().equals(bookTitle)) {
                    // in case if we found needed book we return author's name
                    return entry.getKey().getName();
                }
            }
        }
        // in case if we can't find author's name return null
        return null;
    }
}
