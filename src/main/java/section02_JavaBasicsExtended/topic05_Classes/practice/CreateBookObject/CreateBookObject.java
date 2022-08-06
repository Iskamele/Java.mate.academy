package section02_JavaBasicsExtended.topic05_Classes.practice.CreateBookObject;

public class CreateBookObject {
    public Book[] getBooks() {
        Book firstBook = new Book();
        firstBook.title = "На западном фронте без перемен.";
        firstBook.numberOfPages = 600;
        firstBook.price = 499;

        Book secondBook = new Book();
        secondBook.title = "Три товарища.";
        secondBook.numberOfPages = 300;
        secondBook.price = 300;

        Book thirdBook = new Book();
        thirdBook.title = "Чёрный обелиск.";
        thirdBook.numberOfPages = 301;
        thirdBook.price = 50;

        return new Book[]{firstBook, secondBook, thirdBook};
    }
}
