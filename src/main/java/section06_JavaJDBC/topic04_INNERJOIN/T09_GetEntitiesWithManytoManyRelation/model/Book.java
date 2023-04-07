package section06_JavaJDBC.topic04_INNERJOIN.T09_GetEntitiesWithManytoManyRelation.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private BigDecimal price;
    private LiteraryFormat format;
    private List<Author> authors;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LiteraryFormat getFormat() {
        return format;
    }

    public void setFormat(LiteraryFormat format) {
        this.format = format;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(id, book.id)
                && Objects.equals(title, book.title)
                && Objects.equals(price, book.price)
                && Objects.equals(format, book.format)
                && Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, format, authors);
    }

    @Override
    public String toString() {
        return "Book{"
                + "id=" + id
                + ", title='" + title + '\''
                + ", price=" + price
                + ", format=" + format
                + ", authors=" + authors
                + '}';
    }
}
